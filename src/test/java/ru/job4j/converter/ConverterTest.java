package ru.job4j.converter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert145RblThen2dot071Euro() {
        float in = 145;
        float expected = 2.071f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0009f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert0RblThen0Euro() {
        float in = 0;
        float expected = 0f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert185RblThen3dot083Dollar() {
        float in = 185;
        float expected = 3.083f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0009f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        float in = 0;
        float expected = 0f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}