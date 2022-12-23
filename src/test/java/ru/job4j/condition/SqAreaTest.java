package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2dot1Square1dot96() {
        int p = 6;
        double k = 2.1;
        double expected = 1.96;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenP4K1Square1dot96() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }
}