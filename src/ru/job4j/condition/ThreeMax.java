package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            return result;
        } else {
            result = second;
        }
        if (result > third) {
            return result;
        } else {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(2, 66, 4));
    }
}
