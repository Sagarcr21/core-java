package com.xworkz.abstracta.internal;

public abstract class Transport {
    public void startRide() { System.out.println("Ride started"); }
    public static void city() { System.out.println("City: Delhi"); }

    public abstract void speed();
    public abstract void coaches();
}



