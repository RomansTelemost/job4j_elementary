package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void whenX1ZeroX2TwoY1ZeroY2ZeroThen2dot0() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2.0;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    void whenX1ZeroX2TwoY1OneY2OneThen2dot0() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 1;
        int y2 = 1;
        double expected = 2.0;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    void whenX1OneX2OneY1FiveY2OneThen4dot0() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 5;
        int y2 = 1;
        double expected = 4.0;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01d);
    }
}