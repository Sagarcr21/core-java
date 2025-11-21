package com.xworkz.packages.internal;

public interface Hospital {

    public static final String name = "Apollo Hospital";
    public static final int beds = 300;
    public static final boolean emergency = true;
    public static final String location = "Chennai";
    public static final String specialization = "Cardiology";

    public abstract void hospitalName();
    public abstract void hospitalBeds();
    public abstract void hospitalEmergency();
    public abstract void hospitalLocation();
    public abstract void hospitalSpecialization();
}

