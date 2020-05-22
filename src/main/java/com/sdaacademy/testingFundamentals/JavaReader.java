package com.sdaacademy.testingFundamentals;

import java.util.Scanner;

public class JavaReader {
    private Scanner in = new Scanner(System.in);

    public String read() {
        return in.nextLine();

    }

    public String skipFirst2Chars() {
        return read().substring(2);

    }
}
