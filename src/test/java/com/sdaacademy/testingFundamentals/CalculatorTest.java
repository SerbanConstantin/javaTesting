package com.sdaacademy.testingFundamentals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


import org.junit.Test;


public class CalculatorTest {
    public Calculator calculator;


    @Before
    public void instatiateClass() {
        System.out.println("Instantiate");
        calculator = new Calculator();
    }

    @After
    public void cleanClass() {
        System.out.println("Clean");
        calculator = null;

    }


    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAdd() {
        int result = calculator.add(1, 3);
        assertEquals("A crapat", 4, result);

    }

    @Test
    public void testSub() {

        int result = calculator.sub(4, 3);
        assertEquals(result, 1);

    }

    @Test
    public void testAdd2() {

        int result = calculator.add(4, 7);
        assertEquals(result, 0);

    }

    @Test(expected = ArithmeticException.class)
    public void testAddInvalid() {


        int result = calculator.add(Integer.MAX_VALUE, 4);


    }

    @Test
    public void testInvalid() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("Ana are mere");

        int result = calculator.add(Integer.MAX_VALUE, 4);
    }
}
