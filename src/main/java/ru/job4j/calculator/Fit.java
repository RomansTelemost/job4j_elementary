package ru.job4j.calculator;

public class Fit {

    private static final int MAN_HEIGHT_OFFSET = 100;
    private static final int WOMAN_HEIGHT_OFFSET = 110;

    private static final String FORMAT_OUTPUT_MESSAGE = "Ideal weight for a %s with height %s cm is %s";

    public static double manWeight(short height) {
        return (height - MAN_HEIGHT_OFFSET) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - WOMAN_HEIGHT_OFFSET) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;

        double manWeight = manWeight(height);
        double womanWeight = womanWeight(height);

        System.out.println(String.format(FORMAT_OUTPUT_MESSAGE, "man", height, String.format("%.2f", manWeight)));
        System.out.println(String.format(FORMAT_OUTPUT_MESSAGE, "woman", height, String.format("%.2f", womanWeight)));
    }
}
