package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Restaurant;

public class GreenHotel extends Restaurant {

    @Override
    public void dishes() { System.out.println("Dishes: 150+"); }
    @Override
    public void seating() { System.out.println("Seats: 100"); }
}

