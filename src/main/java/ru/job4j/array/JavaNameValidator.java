package ru.job4j.array;

public class JavaNameValidator {

    public static void main(String[] args) {
        String s = "Roman";
        String number = "0123";
        char[] charArray = s.toCharArray();
//        ch.co
        Character.isDigit('2');
        int code = number.codePointAt(0);
        System.out.println(code);
    }

    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 && !isLowerLatinLetter(name.codePointAt(i))) {
                return false;
            } else {
                if (!isSpecialSymbol(name.codePointAt(i))
                        && !isUpperLatinLetter(name.codePointAt(i))
                        && !isLowerLatinLetter(name.codePointAt(i))
                && !Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }
}
