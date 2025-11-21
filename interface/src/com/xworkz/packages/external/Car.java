package com.xworkz.packages.external;

import com.xworkz.packages.internal.Vehicle;

public class Car implements Vehicle {
    @Override
    public void vechileprice() {
        System.out.println("the vechile type is car===="+price);
    }

    @Override
    public void fuelType() {
        System.out.println("the fuel type is desiel===="+type);
    }

    @Override
    public void seatCapacity() {
        System.out.println("the car seat capacity is 5 and is that is avialable==="+isAvailable);
    }

    @Override
    public void vehicleseries() {
        System.out.println("the car series ==="+series);
    }

    @Override
    public void vehiclename() {
        System.out.println("the vehicle name is ===="+name);
    }

   public  static void main(String[] args) {
        Car car= new  Car();
       car.fuelType();
       car.seatCapacity();
       car.vechileprice();
       car.vehicleseries();
       car.vehiclename();

    }
}
