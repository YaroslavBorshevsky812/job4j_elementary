package ru.job4j;

public class Converter {

    public static float rubleToEuro(int value) {

        float rsl  =(float) value / 86;
        System.out.println(value+" "+ "Рублей"+" "+"="+" " + rsl+" "+ "евро");
        return rsl;
    }

    public static float rubleToDollar(int value) {

        float rsl = (float) value /73;
        System.out.println(value+" "+ "Рублей"+" "+"="+" " + rsl+" "+ "долларов");
        return rsl;
    }

    public static void main(String[] args) {
        Converter.rubleToEuro(140);
        Converter.rubleToDollar(250);

    }
}
