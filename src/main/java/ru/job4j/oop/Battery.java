package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int size){
        this.load = size;
    }
    public void exchange(Battery another){
        another.load = another.load + this.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(2);
        Battery second = new Battery(6);
        System.out.println("first Battery has: " + first.load + ". Second Battery has: " + second.load);
        first.exchange(second);
        System.out.println("after exchanging");
        System.out.println("first Battery has: " + first.load + ". Second Battery has: " + second.load);
    }
}
