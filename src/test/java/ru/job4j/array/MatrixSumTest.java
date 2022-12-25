package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFive() {
        int[][] array = {
                {1, 2, 1, 5, 7},
                {1, 2, 0, 2, 9},
                {5, 1, 5, 2, 5}
        };
        int result = MatrixSum.sum(array);
        int expected = 48;
        assertThat(result).isEqualTo(expected);
    }
}