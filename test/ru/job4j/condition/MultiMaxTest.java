package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        assertThat(MultiMax.max(23, 12, 20), is(23));
    }

    @Test
    public void whenTherdMax() {
        assertThat(MultiMax.max(23, 15, 56), is(56));
    }
}