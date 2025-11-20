package com.xworkz.packages.internal;

public class Snake {
    public String type;
    public int length;
    public boolean isVenomous;
    public float weight;
    public char dangerLevel;

    public Snake() {
        System.out.println("No-args Constructor");
    }

    public Snake(String type, int length, boolean isVenomous, float weight, char dangerLevel) {
        System.out.println("All-args Constructor");
        this.type = type;
        this.length = length;
        this.isVenomous = isVenomous;
        this.weight = weight;
        this.dangerLevel = dangerLevel;
    }

    public String toString() {
        return "Snake{type=" + type + ", length=" + length +
                ", isVenomous=" + isVenomous + ", weight=" + weight + ", dangerLevel=" + dangerLevel + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Snake other = (Snake) obj;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + type.hashCode();
        result = prime * result + length;
        result = prime * result + Boolean.hashCode(isVenomous);
        result = prime * result + Float.hashCode(weight);
        result = prime * result + Character.hashCode(dangerLevel);
        return result;

    }
}
