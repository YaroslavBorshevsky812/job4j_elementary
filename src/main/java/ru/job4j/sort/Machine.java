package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        int index = 0;
        while (sum != 0) {
            if (sum >= coins[index]) {
                rsl[size] = coins[index];
                sum = sum - coins[index];
                size++;
            } else {
                index++;
            }
        }
            return Arrays.copyOf(rsl, size);
        }
}


