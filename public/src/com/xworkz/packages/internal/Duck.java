package com.xworkz.packages.internal;

public class Duck {
    public int price;
    public char series;
    public boolean canSwim;
    public String age;
    public String name;

    public Duck() {
        System.out.println("NO args Constructor");
    }

    public Duck(int price, char series, boolean canSwim, String age, String name) {
        System.out.println("all args constructor");
        this.price = price;
        this.series = series;
        this.canSwim = canSwim;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Duck{price=" + price + " series=" + series +
                " canSwim=" + canSwim + " age=" + age + " name=" + name + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Duck other = (Duck) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(canSwim);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}

