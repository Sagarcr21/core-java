package com.xworkz.abstracta.internal;


public abstract class Country {
    public static void myCounry(){
        System.out.println("i love my country");
    }
    public void countryNmae(){
        System.out.println("my country name india");
    }
    public abstract void name();
    public abstract void capital();
    public abstract void population();
    public abstract void currency();
    public abstract void continent();
}
