package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void whenX1ZeroX2TwoY1ZeroY2ZeroThen2dot0() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);
        double expected = 2.0;
        double actual = pointB.distance(pointA);
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    void whenX1ZeroX2TwoY1OneY2OneThen2dot0() {
        Point pointA = new Point(0, 1);
        Point pointB = new Point(2, 1);
        double expected = 2.0;
        double actual = pointB.distance(pointA);
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    void whenX1OneX2OneY1FiveY2OneThen4dot0() {
        Point pointA = new Point(1, 5);
        Point pointB = new Point(1, 1);
        double expected = 4.0;
        double actual = pointB.distance(pointA);
        Assert.assertEquals(expected, actual, 0.01d);
    }

    @Test
    void whenX1OneX2OneY1FiveY2OneZ1OneZ2TwoThen5dot0() {
        Point pointA = new Point(1, 5, 5);
        Point pointB = new Point(1, 1, 2);
        double expected = 5.0;
        double actual = pointB.distance3d(pointA);
        Assert.assertEquals(expected, actual, 0.01d);
    }
}