package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        assertThat(Factorial.calc(5),is(120));/* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        assertThat(Factorial.calc(0),is(1));/* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }


}