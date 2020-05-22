package com.sdaacademy.testingFundamentals;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CNPDetection {
    private String cnp;

    public CNPDetection(String cnp) {
        if (cnp == null || cnp.length() < 7) {
            throw new InvalidParameterException("CNP invalid");
        }
        this.cnp = cnp;
    }

    public String getGender() {
        switch (cnp.substring(0, 1)) {
            case "1":
            case "3":
            case "5":
                return "M";
            case "2":
            case "4":
            case "6":
                return "F";
            default:
                throw new InvalidParameterException("CNP invalid");
        }
    }

    public Date getDate(){
        String an = cnp.substring(1,3);
        String luna = cnp.substring(3,5);
        String zi = cnp.substring(5,7);
        Date data = new Date();
        data.setDate(Integer.parseInt(zi));
        data.setMonth(Integer.parseInt(luna));
        data.setYear(Integer.parseInt(an));
        return data;
    }public long getAge(){
        long years = ChronoUnit.YEARS.between(getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
        return years;
    }
}
