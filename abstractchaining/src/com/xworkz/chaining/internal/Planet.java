package com.xworkz.chaining.internal;

public abstract class Planet {
    String name;

    public Planet() {
        System.out.println("Planet: No-Args Constructor");
    }

    public Planet(String name) {
        this.name = name;
        System.out.println("Planet: Parameterized Constructor");
    }

    public void rotate() { System.out.println("Planet rotates"); }
    public static void galaxy() { System.out.println("Galaxy: Milky Way"); }

    public abstract void size();
    public abstract void population();
}




