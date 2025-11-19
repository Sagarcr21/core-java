package com.xworkz.access.internal;

public class Hotel {
    protected int price;
    protected String name;
    protected boolean isOpen;
    protected char grade;

    // private constructor
    protected Hotel(int price, String name, boolean isOpen, char grade) {
        this.price = price;
        this.name = name;
        this.isOpen = isOpen;
        this.grade = grade;
    }


}

