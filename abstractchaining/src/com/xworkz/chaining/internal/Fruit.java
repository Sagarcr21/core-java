package com.xworkz.chaining.internal;

public abstract class Fruit {
    String color;

    public Fruit() {
        System.out.println("Fruit: No-Args Constructor");
    }

    public Fruit(String color) {
        this.color = color;
        System.out.println("Fruit: Parameterized Constructor");
    }

    public void taste() { System.out.println("Fruit taste varies"); }
    public static void type() { System.out.println("Type: Natural Food"); }

    public abstract void season();
    public abstract void price();
}




