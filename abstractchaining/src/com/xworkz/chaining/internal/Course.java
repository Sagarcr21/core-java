package com.xworkz.chaining.internal;

public abstract class Course {
    String name;

    public Course() {
        System.out.println("Course: No-Args Constructor");
    }

    public Course(String name) {
        this.name = name;
        System.out.println("Course: Parameterized Constructor"+name);
    }

    public void start() { System.out.println("Course Started"); }
    public static void type() { System.out.println("Type: IT Course"); }

    public abstract void duration();
    public abstract void fee();
}
