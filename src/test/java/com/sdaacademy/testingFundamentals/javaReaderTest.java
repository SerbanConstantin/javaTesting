package com.sdaacademy.testingFundamentals;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class javaReaderTest {
    @Test
    public void testeReader() {
        JavaReader reader = mock(JavaReader.class);
        when(reader.read()).thenReturn("23");
        assertEquals("23", reader.read());
    }

    @Test
    public void skipFirst2CharsTest() {
        JavaReader reader = mock(JavaReader.class);
        when(reader.read()).thenReturn("233");
        assertEquals("3", reader.skipFirst2Chars());
    }
}