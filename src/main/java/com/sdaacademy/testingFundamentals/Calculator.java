package com.sdaacademy.testingFundamentals;

public class Calculator {
    public int add(int x, int y) {
        long result = (long) x + y;
        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("Ana are mere");

        }
        return x + y;

    }

    public int sub(int x, int y) {
        return x - y;

    }
}
