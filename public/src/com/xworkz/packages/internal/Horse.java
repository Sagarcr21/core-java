package com.xworkz.packages.internal;

public class Horse {
    public int speed;
    public String breed;
    public boolean isTrained;
    public double height;
    public char symbol;

    public Horse() {
        System.out.println("No-args Constructor");
    }

    public Horse(int speed, String breed, boolean isTrained, double height, char symbol) {
        System.out.println("All-args Constructor");
        this.speed = speed;
        this.breed = breed;
        this.isTrained = isTrained;
        this.height = height;
        this.symbol = symbol;
    }

    public String toString() {
        return "Horse{speed=" + speed + ", breed=" + breed +
                ", isTrained=" + isTrained + ", height=" + height + ", symbol=" + symbol + "}";
    }

public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }

    Horse c = (Horse) obj;
    return false;
}
}
