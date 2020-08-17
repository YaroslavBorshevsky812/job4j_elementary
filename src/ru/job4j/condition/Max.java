package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
    public static int max(int first, int second, int third){
        return max(max(first, second), third);
    }
    public static int max(int first, int second, int third, int fourth, int fifth,  int six ){
        return max(max(first, second, third), max(first, second, third));
    }

    public static void main(String[] args) {
        System.out.println(max(2, 3));
        System.out.println(max(145, 2, 1));
        System.out.println();
    }
}
