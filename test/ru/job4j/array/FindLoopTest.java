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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind22() {
        assertThat(FindLoop.indexOf(new int[]{5, 2, 27, 12, 10, 45}, 22, 2,5), is(-1));
    }

}