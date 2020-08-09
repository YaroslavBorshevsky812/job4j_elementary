package ru.job4j.loop;

import com.sun.security.jgss.GSSUtil;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
    if (number == 1){
        prime = false;
    }
        for (int i = 2; i < number - 1; i++){

            if (number % 2 == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
