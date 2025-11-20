package com.xworkz.chaining.internal;

public abstract class Building {
    int floors;

    public Building() {
        System.out.println("Building: No-Args Constructor");
    }

    public Building(int floors) {
        this.floors = floors;
        System.out.println("Building: Parameterized Constructor"+floors);
    }

    public void openGate() { System.out.println("Gate opened"); }
    public static void category() { System.out.println("Category: Residential"); }

    public abstract void rooms();
    public abstract void area();
}

