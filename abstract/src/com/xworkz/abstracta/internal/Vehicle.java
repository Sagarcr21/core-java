package com.xworkz.abstracta.internal;

public abstract class Vehicle {
    public abstract void start();
    public abstract void stop();
    public abstract void fuelType();
    public  abstract void wheels();
    public abstract void speed();

    public abstract static class Bird {
        public abstract void name();
        public abstract void color();
        public abstract void sound();
        public abstract void fly();
        public abstract void food();
    }
}








