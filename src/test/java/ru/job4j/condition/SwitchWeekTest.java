package ru.job4j.condition;

import org.junit.jupiter.api.Test;

class SwitchWeekTest {

    @Test
    void whenDayOfWeek1ThenMonday() {
        int dayOfWeekNumber = 1;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Monday");

    }

    @Test
    void whenDayOfWeek2ThenTuesday() {
        int dayOfWeekNumber = 2;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Tuesday");

    }

    @Test
    void whenDayOfWeek3ThenWednesday() {
        int dayOfWeekNumber = 3;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Wednesday");

    }

    @Test
    void whenDayOfWeek4ThenThursday() {
        int dayOfWeekNumber = 4;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Thursday");

    }

    @Test
    void whenDayOfWeek5ThenFriday() {
        int dayOfWeekNumber = 5;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Friday");

    }

    @Test
    void whenDayOfWeek6ThenSaturday() {
        int dayOfWeekNumber = 6;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Saturday");

    }

    @Test
    void whenDayOfWeek7ThenSunday() {
        int dayOfWeekNumber = 7;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Sunday");

    }

    @Test
    void whenDayOfWeek8ThenError() {
        int dayOfWeekNumber = 8;
        String nameOfDay = SwitchWeek.nameOfDay(dayOfWeekNumber);
        org.assertj.core.api.Assertions.assertThat(nameOfDay).isEqualTo("Error");

    }
}