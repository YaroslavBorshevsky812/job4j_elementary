package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 187;
        int expected = 100;
        int out = (int) Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void womanWeight() {
        int in = 165;
        int expected = 63;
        int out = (int) Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }
}