package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }
}