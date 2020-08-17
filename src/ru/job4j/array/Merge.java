package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int buf1 = 0;
        int buf2 = 0;
        int min = left[0];
        int min1 = right[0];

        for (int index = 0; index < rsl.length; index++) {

            for (int i = 1; i < left.length; i++) {
                if (left[i] < min) {
                    min = left[i];
                    buf1 = left[i];
                } else {
                    buf1 = min;
                }
            }

            for (int j = 1; j < right.length; j++) {
                if (right[j] < min1) {
                    min1 = right[j];
                    buf2 = right[j];
                } else {
                    buf2 = min1;
                }
            }

            if (buf1 < buf2){
                rsl[index] = buf1;
            } else {
                rsl[index] = buf2;
            }
            System.out.println("сравниваю" + buf1 + "и" + buf2);
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

