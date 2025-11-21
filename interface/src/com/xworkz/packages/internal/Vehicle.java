package com.xworkz.packages.internal;

public interface Vehicle {

    public static final int price = 10000;
    public static final String type = "disel";
    public static final char series = 'A';
    public static final boolean isAvailable = true;
    public static final String name = "honda";

    public abstract void vechileprice();

    public abstract void fuelType();

    public abstract void seatCapacity();

    public abstract void vehicleseries();

    public abstract void vehiclename();
}








