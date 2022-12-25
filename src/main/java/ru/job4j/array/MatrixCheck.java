package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char firstElement = board[row][0];
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != firstElement) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char firstElement = board[0][column];
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != firstElement) {
                result = false;
                break;
            }
        }
        return result;
    }
}
