package ru.job4j;

public class Converter {

    public static float rubleToEuro(int value) {
        float rsl =(float) value / 86;
        return rsl;
    }

    public static float rubleToDollar(int value) {
        float rsl  =(float) value / 73;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(250);
        System.out.println("250 rubles are " + dollar + " dollars.");
    }
}