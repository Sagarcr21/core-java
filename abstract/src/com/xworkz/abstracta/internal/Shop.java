package com.xworkz.abstracta.internal;

public abstract class Shop {
    public void open() { System.out.println("Shop opened."); }
    public static void category() { System.out.println("Category: Retail"); }

    public abstract void products();
    public abstract void staff();
}
