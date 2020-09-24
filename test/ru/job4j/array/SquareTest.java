package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5() {
        assertThat(Square.calculate(5), is(new int[]{0, 1, 4, 9, 16}));
    }
}