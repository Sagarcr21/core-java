package com.xworkz.packages.internal;

public class Rabbit {
    public int price;
    public char series;
    public boolean isPet;
    public String age;
    public String name;

    public Rabbit(){
        System.out.println("NO args Constructor");
    }
    public Rabbit(int price, char series, boolean isPet, String age, String name){
        System.out.println("all args constructor");
        this.price = price;
        this.series = series;
        this.isPet = isPet;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Rabbit{price=" + price + " series=" + series +
                " isPet=" + isPet + " age=" + age + " name=" + name + "}";
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        Rabbit other = (Rabbit) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(isPet);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}

