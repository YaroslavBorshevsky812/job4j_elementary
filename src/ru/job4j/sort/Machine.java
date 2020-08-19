package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = money - price;
        int index = 0;
        int index1 = 0;
            while (size != 0) {
                for (coins[index1] < rsl[index] && coins[index1] > coins[index + 1]) {
                    rsl[index] = coins[index1];
                    size = size - coins[index1];
                    index++;
                    if (coins[index1] >= rsl[index]){
                        index1++;
                    }
                }
            }

        return Arrays.copyOf(rsl, size);
    }
}
