package ru.job4j.array;

import javax.management.MBeanAttributeInfo;

public class Matrix {
    public static void main(String[] args) {

        int array[][] = new int[3][3];
        int x = 0;
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = x * k;
                x++;
                System.out.print(x);
                if (x == 3){
                    System.out.println();
                    k++;
                    System.out.println(k);
                }
            }
        }

    }
}