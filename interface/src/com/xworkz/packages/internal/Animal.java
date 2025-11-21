package com.xworkz.packages.internal;

public interface Animal {

    public static final String type = "Dog";
    public static final boolean isPet = true;
    public static final int legs = 4;
    public static final String sound = "Bark";
    public static final String color = "Brown";

    public abstract void animalType();
    public abstract void petType();
    public abstract void animalLegs();
    public abstract void animalSound();
    public abstract void animalColor();
}

