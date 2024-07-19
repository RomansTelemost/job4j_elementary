package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String inputString) {
        StringBuilder result = new StringBuilder();
        int symbolCounter = 1;
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if (i == inputString.length() - 1 || inputString.charAt(i) != inputString.charAt(i + 1)) {
                result.append(inputString.charAt(i));
                if (symbolCounter != 1) {
                    result.append(symbolCounter);
                    symbolCounter = 1;
                }
            } else {
                symbolCounter++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("aaabbc"));

    }
}
