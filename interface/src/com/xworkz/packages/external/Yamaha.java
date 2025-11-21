package com.xworkz.packages.external;

import com.xworkz.packages.internal.Bike;

public class Yamaha implements Bike {

    public void bikeBrand() { System.out.println("Bike brand === " + brand); }
    public void bikeEngine() { System.out.println("Engine CC === " + engineCC); }
    public void bikeABS() { System.out.println("ABS Available === " + isABS); }
    public void bikeColor() { System.out.println("Bike color === " + color); }
    public void bikePrice() { System.out.println("Bike price === " + price); }

    public static void main(String[] args) {
        Yamaha y = new Yamaha();
        y.bikeBrand();
        y.bikeEngine();
        y.bikeABS();
        y.bikeColor();
        y.bikePrice();
    }
}

