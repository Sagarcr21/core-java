package com.xworkz.abstracta.internal;

public abstract class Gadget {
    public void turnOn() { System.out.println("Gadget ON"); }
    public static void brand() { System.out.println("Brand: Apple"); }

    public abstract void features();
    public abstract void battery();
}



