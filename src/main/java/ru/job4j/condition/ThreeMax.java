package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > result) {
            result = second;
        } else {
            result = first;
        }
        if (third > result) {
           result = third;
        }
        return result;
    }
        public static void main (String[]args){
            System.out.println(max(2, 66, 4));
        }

}
