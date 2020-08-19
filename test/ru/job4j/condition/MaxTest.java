package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));

    }

    @Test
    public void whenMax1To2Then() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1ThenBoth() {
        int result = Math.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenThreeNums() {

        int result = Max.max(3, 77, 15);
        assertThat(result, is(77));
    }

    @Test
    public void whenFourthNums() {

        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
