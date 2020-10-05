package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl =  value / 86;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl =  value / 73;
        return rsl;
    }


    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = (int) rubleToEuro (in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 250;
        int ecpeted1 = 3;
        int out1 = (int) rubleToDollar(in);
        boolean passed1 = ecpeted1 == out;
        System.out.println("250 rubles are 2. Test result : " + passed1);

    }
}