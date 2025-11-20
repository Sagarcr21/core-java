package com.xworkz.abstracta.internal;

public abstract class Restaurant {

    public void menu() {
        System.out.println("Menu displayed.");
    }
    public void billing() {
        System.out.println("Billing started.");
    }

    public static void place() {
        System.out.println("Place: Bangalore");
    }
    public static void type() {
        System.out.println("Type: Veg");
    }

    public abstract void dishes();
    public abstract void seating();
}

