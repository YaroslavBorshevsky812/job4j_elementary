package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int min = left[0];
        int buf = 0;
        int buf1 = 0;
        int min1 = right[0];

        for (int index = 0; index < rsl.length; index++) {


            for (int i = 1; i < left.length; i++) {
                if (left[i] < min) {
                    min = left[i];
                }
            }
            for (int i = 1; i < right.length; i++) {
                if (right[i] < min1) {
                    min1 = right[i];
                }
            }
            if (min < min1){
                rsl[index] = min;
            } else {
                rsl[index] = min1;
            }
        }

        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i]);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int one[] = {3, 1, 2, 5, 4};
        int two [] = {7, 6, 10, 8, 9};
        merge(one, two);
    }

}

