package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

            System.out.println(" ");
            for (int i = 0; i < array.length / 2; i++) {
                int some = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = some;
            }
            return array;
        }
    }



