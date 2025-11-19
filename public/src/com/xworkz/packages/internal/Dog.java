package com.xworkz.packages.internal;

public class Dog {
    public int price;
    public char series;
    public boolean isAvailable;
    public String age;
    public String name;

    public Dog(){
        System.out.println("NO args Constructor");
    }
    public Dog( int price, char series,boolean isAvailable, String age, String name){
        System.out.println("all args constructor");
        this.price=price;
        this.series=series;
        this.isAvailable=isAvailable;
        this.age=age;
        this.name=name;


    }

    public String toString(){
        return "Dog{price="+price+"series="+series+
                "isAvailable="+isAvailable+"age="+age+"name="+name+"}";
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }

        Dog other=(Dog) obj;
        return false;

    }

    @Override
    public int hashCode() {
        int result=1;
        int prime=7;

        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(isAvailable);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}




