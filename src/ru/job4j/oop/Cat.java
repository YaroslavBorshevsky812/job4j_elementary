package ru.job4j.oop;

public class Cat {

        private String name;
        private String food;


    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick){
        this.name = nick;
    }
    public void show() {
        System.out.println("There are " + name + "'s food " + food);
    }


    public static void main(String[] args) {
        Cat peppy  = new Cat();
            peppy.food = "Котлета";
            peppy.name = "black";
            peppy.show();

    }
}
