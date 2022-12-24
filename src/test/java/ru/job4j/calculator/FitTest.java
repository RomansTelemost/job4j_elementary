package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenManHeight181ThenManWeight93dot14() {
        short manHeight = 181;
        double expected = 93.14;
        double actual = Fit.manWeight(manHeight);
        double delta = 0.01d;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    void whenWomanHeight181ThenWomanWeight81dot64() {
        short womanHeight = 181;
        double expected = 81.64;
        double actual = Fit.womanWeight(womanHeight);
        double delta = 0.01d;
        Assert.assertEquals(expected, actual, delta);
    }
}