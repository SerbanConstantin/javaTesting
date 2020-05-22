package com.sdaacademy.testingFundamentals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockTest {


    @Test
    public void add() {
        Calculator calcMock = mock(Calculator.class);
        when(calcMock.add(1, 3)).thenReturn(4);
        assertEquals(4, calcMock.add(1, 3));
    }

    @Test
    public void sub() {
        Calculator calcMock = mock(Calculator.class);
        when(calcMock.sub(7, 3)).thenReturn(4);
        assertEquals(4, calcMock.sub(7, 3));
    }
}

