package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i  = row; i < row; i++) {
            if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
        }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = column; i < column; i++) {
                if (board[i][column] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                rsl[i] = board[i][i];
            }
        }
        return rsl;
    }
}
