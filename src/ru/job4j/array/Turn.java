package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int buf = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = buf;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
            System.out.println(" ");
            for (int i = 1; i < array.length - i; i++) {
                int some = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = some;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            return array;
        }

    }


