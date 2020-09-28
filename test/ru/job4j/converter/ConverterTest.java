package ru.job4j.converter;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        assertEquals(expected, out);
    }
}