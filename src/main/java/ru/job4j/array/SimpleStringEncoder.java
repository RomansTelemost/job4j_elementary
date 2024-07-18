package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String inputString) {
        StringBuilder result = new StringBuilder();
        int symbolCounter = 1;
        char[] charArr = inputString.toCharArray();
        for (int i = 0; i <= charArr.length - 1; i++) {
            if (i == charArr.length - 1 || charArr[i] != charArr[i + 1]) {
                result.append(charArr[i]);
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
