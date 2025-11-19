package com.xworkz.abstracta.internal;

public abstract class University {

    public void campus() {
        System.out.println("Campus is active.");
    }

    public void canteen() {
        System.out.println("Canteen is open.");
    }

    public static void uniName() {
        System.out.println("University: VTU");
    }

    public static void state() {
        System.out.println("State: Karnataka");
    }

    public abstract void branches();
    public abstract void studentsCount();
}

