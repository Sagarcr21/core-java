package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Vehicle;

class Car extends Vehicle {
    @Override
    public void start() {
            System.out.println("Car starts");
        }
    @Override
    public void stop() {
            System.out.println("Car stops");
        }
    @Override
    public void fuelType() {
            System.out.println("Petrol");
        }
    @Override
    public  void wheels() {
            System.out.println("4 wheels");
        }
    @Override
    public void speed() {
            System.out.println("120km/h");
        }
}
