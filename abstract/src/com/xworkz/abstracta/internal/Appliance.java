package com.xworkz.abstracta.internal;

public abstract class Appliance {
    public void start() { System.out.println("Appliance started"); }
    public static void warranty() { System.out.println("Warranty: 2 years"); }

    public abstract void capacity();
    public abstract void type();
}




