package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceIsRirgh() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 2;
        int y2 = 6;
        int expected = 4;
        int rsl = (int) Point.distance(x1, y1, x2, y2);
        assertThat(rsl, is(expected));

    }
}