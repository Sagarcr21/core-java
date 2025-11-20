package com.xworkz.access.internal;

public class Hotel {
    public int price;
    public String name;
    public boolean isAvailable;
    public char rating;

    public Hotel(int price, String name, boolean isAvailable, char rating) {
        this.price = price;
        this.name = name;
        this.isAvailable = isAvailable;
        this.rating = rating;
    }
}
