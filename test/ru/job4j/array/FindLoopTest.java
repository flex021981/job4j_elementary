package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }


    @Test
    public void whenArrayHas45Then3() {
        assertThat(FindLoop.indexOf(new int[]{5, 10, 12, 45}, 45), is(3));
    }

    @Test
    public void whenArrayHas10Then4() {
        assertThat(FindLoop.indexOf(new int[]{5, 2, 27, 12, 10, 45}, 10), is(4));
    }
}