package com.xworkz.packages.internal;

public class Panda {
    public int price;
    public char series;
    public boolean isWild;
    public String age;
    public String name;

    public Panda() {
        System.out.println("NO args Constructor");
    }

    public Panda(int price, char series, boolean isWild, String age, String name) {
        System.out.println("all args constructor");
        this.price = price;
        this.series = series;
        this.isWild = isWild;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Panda{price=" + price + " series=" + series +
                " isWild=" + isWild + " age=" + age + " name=" + name + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Panda other = (Panda) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 70000;


        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(isWild);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}

