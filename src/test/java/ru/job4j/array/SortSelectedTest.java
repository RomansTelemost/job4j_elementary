package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSize5ThenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSize3ThenSort() {
        int[] data = new int[] {1, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSize11ThenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5, 13, 16, 16, 17, 3, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 3, 4, 5, 13, 16, 16, 17};
        assertThat(result).containsExactly(expected);
    }

}