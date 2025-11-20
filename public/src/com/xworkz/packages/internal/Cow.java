package com.xworkz.packages.internal;

public class Cow {
    public int price;
    public char series;
    public boolean givesMilk;
    public String age;
    public String name;

    public Cow(){
        System.out.println("NO args Constructor");
    }
    public Cow(int price, char series, boolean givesMilk, String age, String name){
        System.out.println("all args constructor");
        this.price = price;
        this.series = series;
        this.givesMilk = givesMilk;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Cow{price=" + price + " series=" + series +
                " givesMilk=" + givesMilk + " age=" + age + " name=" + name + "}";
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        Cow other = (Cow) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(givesMilk);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}
