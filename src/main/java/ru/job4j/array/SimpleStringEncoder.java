package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String inputString) {
        StringBuilder result = new StringBuilder();
        char symbol = inputString.charAt(0);
        int symbolCounter = 1;

        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == symbol) {
                symbolCounter++;
            } else {
                result.append(symbol);
                symbol = inputString.charAt(i);
                if (symbolCounter != 1) {
                    result.append(symbolCounter);
                    symbolCounter = 1;
                }
            }
        }
        result.append(symbol);
        if (symbolCounter != 1) {
            result.append(symbolCounter);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("aaabbbc"));
    }
}
