package com.xworkz.packages.internal;

public interface TV {

    public static final String brand = "Sony";
    public static final int size = 55;
    public static final boolean smart = true;
    public static final String display = "OLED";
    public static final int price = 85000;

    public abstract void tvBrand();
    public abstract void tvSize();
    public abstract void tvSmart();
    public abstract void tvDisplay();
    public abstract void tvPrice();
}

