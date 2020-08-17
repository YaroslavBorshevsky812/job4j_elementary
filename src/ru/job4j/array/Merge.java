package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = index1; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int i = left.length; i < rsl.length; i++) {
            rsl[i] = right[index2];
            index2++;
        }

        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);

        }
        return rsl;
    }

}

