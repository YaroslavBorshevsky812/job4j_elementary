package ru.job4j.loop;

import javax.imageio.stream.ImageInputStream;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n == 0){
            result = 1;
        }
        for (int i = 1; i <= n; i++){
            result *= i;
        }

            return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(0));
        System.out.println(calc(1));
    }
}
