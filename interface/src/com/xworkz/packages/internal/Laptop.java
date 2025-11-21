package com.xworkz.packages.internal;

public  interface Laptop {
    public static final int price = 55000;
    public static final String processor = "Intel i7";
    public static final boolean isTouch = false;
    public static final String brand = "Dell";

    public abstract void laptopPrice();
    public abstract void laptopProcessor();
    public abstract void touchSupport();
    public abstract void laptopBrand();
}


