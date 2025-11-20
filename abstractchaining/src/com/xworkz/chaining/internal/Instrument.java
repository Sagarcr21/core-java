package com.xworkz.chaining.internal;

public abstract class Instrument {
    int price;
    boolean isAvailable;


    public Instrument(int price){
        this(5663,true);
        this.price=price;

    }
    public  Instrument(int price,boolean isAvailable){
        this.price=price;
        this.isAvailable=isAvailable;
        System.out.println("the price of the instrument-------"+price);
        System.out.println("the  instrument is available---------"+isAvailable);
    }
    public static void category() {
        System.out.println("Category: Musical Instrument");
    }
    public void play() {
        System.out.println("Instrument is being played...");
    }
    public abstract void type();
    public abstract void soundOutput();

}
