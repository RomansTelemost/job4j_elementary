package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrgAreaTest {

    @Test
    void whenA2B2C2Then1dot73() {
        double a = 2;
        double b = 2;
        double c = 2;
        double expect = 1.73;
        double result = TrgArea.area(a, b, c);
        double delta = 0.01d;
        Assert.assertEquals(expect, result, delta);
    }

    @Test
    void whenA2dot35B2dot5C2dot9Then2dot81() {
        double a = 2.35;
        double b = 2.5;
        double c = 2.9;
        double expect = 2.81;
        double result = TrgArea.area(a, b, c);
        double delta = 0.01d;
        Assert.assertEquals(expect, result, delta);
    }

    @Test
    void whenA1dot5B6C4dot33Then4dot66() {
        double a = 2.5;
        double b = 6;
        double c = 4.33;
        double expect = 4.66;
        double result = TrgArea.area(a, b, c);
        double delta = 0.01d;
        Assert.assertEquals(expect, result, delta);
    }
}