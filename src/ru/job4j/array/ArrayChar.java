package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;

        if (word != pref){
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'П', 'Р', 'Е'};
        char[] pref = {'П', 'Р', 'Е'};

        System.out.println(startsWith(word, pref));
    }
}