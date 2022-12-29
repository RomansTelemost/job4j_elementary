package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(3, 2));
        System.out.println(max(0, 0));
    }
}
