package com.sdaacademy.testingFundamentals;

public class JavaFormatReader {
    public JavaReader reader = new JavaReader();

    public String readFormatter(){
        return reader.read().substring(2);

    }

}
