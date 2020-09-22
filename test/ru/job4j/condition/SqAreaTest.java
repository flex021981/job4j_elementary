package ru.job4j.condition;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void squareP8K2then2(){
        assertEquals(2,SqArea.square(8,2),0.01);

    }
    @Test
    public void squareP18K3then12(){
        assertEquals(12,SqArea.square(18,3),0.01);

    }
}