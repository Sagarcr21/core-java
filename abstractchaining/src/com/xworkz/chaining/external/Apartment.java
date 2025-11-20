package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Building;

class Apartment extends Building {
    int flats;

    public Apartment() {
        super();
        System.out.println("Apartment: No-Args Constructor");
    }

    public Apartment(int floors, int flats) {
        super(floors);
        this.flats = flats;
        System.out.println("Apartment: Parameterized Constructor");
    }

    @Override
    public void rooms() { System.out.println("Rooms: 3 BHK"); }

    @Override
    public void area() { System.out.println("Area: 1600 sqft"); }
}





