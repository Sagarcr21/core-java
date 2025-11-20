package com.xworkz.chaining.internal;

public abstract class Artist {
    String name;

    public Artist() {
        System.out.println("Artist: No-Args Constructor");
    }

    public Artist(String name) {
        this.name = name;
        System.out.println("Artist: Parameterized Constructor");
    }

    public void work() { System.out.println("Artist working..."); }
    public static void field() { System.out.println("Field: Art"); }

    public abstract void style();
    public abstract void experience();
}



