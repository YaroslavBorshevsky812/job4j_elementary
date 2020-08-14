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

    }

