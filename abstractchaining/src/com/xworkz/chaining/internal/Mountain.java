package com.xworkz.chaining.internal;

abstract class Mountain {
    int height;

    public Mountain() {
        System.out.println("Mountain: No-Args Constructor");
    }

    public Mountain(int height) {
        this.height = height;
        System.out.println("Mountain: Parameterized Constructor");
    }

    public void view() { System.out.println("Beautiful mountain view"); }
    public static void region() { System.out.println("Region: Asia"); }

    public abstract void climate();
    public abstract void peaks();
}



