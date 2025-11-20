package com.xworkz.packages.internal;

public class Fish {
    public String species;
    public double length;
    public boolean isFreshWater;
    public int price;
    public char grade;

    public Fish() {
        System.out.println("No-args Constructor");
    }

    public Fish(String species, double length, boolean isFreshWater, int price, char grade) {
        System.out.println("All-args Constructor");
        this.species = species;
        this.length = length;
        this.isFreshWater = isFreshWater;
        this.price = price;
        this.grade = grade;
    }

    public String toString() {
        return "Fish{species=" + species + ", length=" + length +
                ", isFreshWater=" + isFreshWater + ", price=" + price + ", grade=" + grade + "}";
    }

public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }

        Fish others = (Fish) obj;
    return false;
}
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + price;
        result = prime * result + Character.hashCode(grade);
        result = prime * result + Boolean.hashCode(isFreshWater);
        result = prime * result + species.hashCode();
        result = prime * result + Double.hashCode(length);
        return result;

    }
}
