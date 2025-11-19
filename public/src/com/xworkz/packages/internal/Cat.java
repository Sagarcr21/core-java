package com.xworkz.packages.internal;



public class Cat {
    protected int price;
    protected char series;
    protected boolean isAvailable;
    protected String age;
    protected String name;

    protected Cat(){
        System.out.println("NO args Constructor");
    }
    protected Cat( int price, char series,boolean isAvailable, String age, String name){
        System.out.println("all args constructor");
        this.price=price;
        this.series=series;
        this.isAvailable=isAvailable;
        this.age=age;
        this.name=name;


    }

    public String toString(){
        return "Cat{price="+price+"series="+series+
                "isAvailable="+isAvailable+"age="+age+"name="+name+"}";
    }
}




