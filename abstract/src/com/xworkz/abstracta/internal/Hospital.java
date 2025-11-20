package com.xworkz.abstracta.internal;

public abstract class Hospital {

    public void emergency() {
        System.out.println("Emergency Ward Open.");
    }
    public void opd() {
        System.out.println("OPD Section Running.");
    }

    public static void hospitalName() {
        System.out.println("Hospital: Apollo");
    }
    public static void established() {
        System.out.println("Established: 1990");
    }

    public abstract void doctors();
    public abstract void beds();
}

