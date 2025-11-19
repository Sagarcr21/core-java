package com.xworkz.abstracta.internal;

public abstract class Animal {
      int price;
      String name;
      boolean isAvailable;
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void showPrice() {
        System.out.println("Animal price: " + price);
    }


    public static void info() {
        System.out.println("This is Animal class static method");
    }

    public static void category() {
        System.out.println("Animals belong to Animalia kingdom");
    }
    public abstract void type();
    public abstract void eat();
    public abstract void sound();
    public abstract void walks();
    public abstract void breed();
    public  Animal(int price){
        this( "jhf", true);
        this.price=price;
        System.out.println("the dog price is ==="+price);

    }
    public Animal(String name,boolean isAvailable){
        this.name=name;
        this.isAvailable=isAvailable;
        System.out.println("the dog price is ==="+name);
        System.out.println("the dog price is ==="+isAvailable);


    }

}



