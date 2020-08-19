package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistance2d() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2.0;
        assertThat(result, is(expected));
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 2, 1);
        Point b = new Point(0, 4, 4);
        double result = a.distance3d(b);
        double expected = 4.69041575982343;
        assertThat(result, is(expected));
    }
}