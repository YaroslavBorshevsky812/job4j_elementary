package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length - 1);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int i = 0; i < data.length; i++) {

           min = MinDiapason.findMin(data, i, data.length - 1);
           index = FindLoop.indexOf(data, min, 0, data.length);

            if (data[i] > min) {
                int buf = data[i];
                data[i] = data[index];
                data[index] = buf;
            }
        }
        return data;
    }
}
