package com.xworkz.chaining.internal;

public abstract class Festival {
    String name;

    public Festival() {
        System.out.println("Festival: No-Args Constructor");
    }

    public Festival(String name) {
        this.name = name;
        System.out.println("Festival: Parameterized Constructor");
    }

    public void celebrate() { System.out.println("Celebrating festival"); }
    public static void country() { System.out.println("Country: India"); }

    public abstract void duration();
    public abstract void specialty();
}




