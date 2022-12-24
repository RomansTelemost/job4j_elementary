package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenPrefixIsGreaterLengthThenNotException() {
        char[] word = {'H', 'i'};
        char[] pref = {'H', 'i', 'r'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }
}