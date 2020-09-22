package ru.job4j.calculator;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80and5() {
        Assert.assertEquals(80.5, Fit.manWeight((short) 170), 0.01);
    }
    @Test
    public void whenWoman170Then69() {
        Assert.assertEquals(69, Fit.womanWeight((short) 170), 0.01);
    }
}