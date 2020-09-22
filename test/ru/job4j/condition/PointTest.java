package ru.job4j.condition;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        Assert.assertEquals(2, Point.distance(0, 0, 0, 2), 0.01);
    }

    @Test
    public void when02to00then2() {
        Assert.assertEquals(2, Point.distance(0, 2, 0, 0), 0.01);
    }

    @Test
    public void when20to00then2() {
        Assert.assertEquals(2, Point.distance(2, 0, 0, 0), 0.01);
    }

}