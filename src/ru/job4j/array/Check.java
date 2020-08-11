package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != result){
                result = false;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}

