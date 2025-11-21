package com.xworkz.packages.internal;

public interface Bike {

    public static final String brand = "Yamaha";
    public static final int engineCC = 150;
    public static final boolean isABS = true;
    public static final String color = "Blue";
    public static final int price = 120000;

    public abstract void bikeBrand();
    public abstract void bikeEngine();
    public abstract void bikeABS();
    public abstract void bikeColor();
    public abstract void bikePrice();
}

