package com.xworkz.abstracta.internal;

public abstract class Computer {
    public void power() { System.out.println("Computer ON"); }
    public static void category() { System.out.println("Category: Electronic"); }

    public abstract void cpu();
    public abstract void storage();
}



