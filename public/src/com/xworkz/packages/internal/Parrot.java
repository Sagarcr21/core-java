package com.xworkz.packages.internal;

public class Parrot {
    public int price;
    public char series;
    public boolean canTalk;
    public String age;
    public String name;

    public Parrot() {
        System.out.println("NO args Constructor");
    }

    public Parrot(int price, char series, boolean canTalk, String age, String name) {
        System.out.println("all args constructor");
        this.price = price;
        this.series = series;
        this.canTalk = canTalk;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Parrot{price=" + price + " series=" + series +
                " canTalk=" + canTalk + " age=" + age + " name=" + name + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Parrot other = (Parrot) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(canTalk);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}

