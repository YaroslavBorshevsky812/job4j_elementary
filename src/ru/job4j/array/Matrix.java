package ru.job4j.array;

import javax.management.MBeanAttributeInfo;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int k = 1;
        int x = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = k * x;
                k++;
                System.out.print(table[i][j] + " ");
                if (j == table[i].length - 1){
                    k = 1;
                }
            }
            x++;
            System.out.println();
        }
        return table;
    }

    public static void main(String[] args) {
        multiple(10);
    }
}