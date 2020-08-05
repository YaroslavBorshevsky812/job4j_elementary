package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenAllRight() {
        int in = 6;
        int in1 = 2;
        int expected = 2;
        int out = (int) SqArea.square(in, in1);
        Assert.assertEquals(expected, out);
    }
}