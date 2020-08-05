package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double s1 = (x1-x2);
        double s2 = Math.pow(s1,2);
        double s3 = (y1-y2);
        double s4 = Math.pow(s3,2);
        double s5 = s2+s4;
        double rsl = Math.sqrt(s5);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 2, 2, 6);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}