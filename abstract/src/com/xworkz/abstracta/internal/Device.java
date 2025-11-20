package com.xworkz.abstracta.internal;

public abstract class Device {
    public void powerOn() { System.out.println("Device is ON"); }
    public static void brand() { System.out.println("Brand: Sony"); }

    public abstract void screenSize();
    public abstract void price();
}








