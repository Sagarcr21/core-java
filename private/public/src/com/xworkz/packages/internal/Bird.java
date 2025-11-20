package com.xworkz.packages.internal;

public class Bird {
    public float wingspan;
    public String species;
    public boolean canFly;
    public int lifespan;
    public char type;

    public Bird() {
        System.out.println("No-args Constructor");
    }

    public Bird(float wingspan, String species, boolean canFly, int lifespan, char type) {
        System.out.println("All-args Constructor");
        this.wingspan = wingspan;
        this.species = species;
        this.canFly = canFly;
        this.lifespan = lifespan;
        this.type = type;
    }

    public String toString() {
        return "Bird{wingspan=" + wingspan + ", species=" + species +
                ", canFly=" + canFly + ", lifespan=" + lifespan + ", type=" + type + "}";
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Bird others = (Bird) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + Float.hashCode(wingspan);
        result = prime * result + lifespan;
        result = prime * result + Boolean.hashCode(canFly);
        result = prime * result + species.hashCode();
        result = prime * result + Character.hashCode(type);
        return result;

    }
}


