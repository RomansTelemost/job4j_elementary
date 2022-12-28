package ru.job4j.loop;

public class Mortgage {

    /**
     *
     * @author Roman Arsentiev (Job4j@gmail.com)
     * Number of years to pay off debt
     * @param amount - total debt
     * @param salary
     * @param percent - loan interest
     * @return
     */
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += percent / 100 * amount;
            amount -= salary;
            year++;
        }
        return year;
    }
}
