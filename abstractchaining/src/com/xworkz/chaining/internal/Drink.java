package com.xworkz.chaining.internal;

public abstract class Drink {
    int quantity;

    public Drink() {
        System.out.println("Drink: No-Args Constructor");
    }

    public Drink(int quantity) {
        this.quantity = quantity;
        System.out.println("Drink: Parameterized Constructor");
    }

    public void serve() { System.out.println("Drink served"); }
    public static void type() { System.out.println("Type: Hot Beverage"); }

    public abstract void flavor();
    public abstract void price();
}



