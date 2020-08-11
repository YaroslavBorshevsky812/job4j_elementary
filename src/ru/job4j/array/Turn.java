package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int buf = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = buf;

        for (int i = 0; i > array.length; i-- ) {
            int some = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = some;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int mass[] = {1, 2, 3, 4, 5};
        int mass1[] = {1, 2, 3, 4};

        back(mass);
        System.out.println();
        back(mass1);
    }
}

