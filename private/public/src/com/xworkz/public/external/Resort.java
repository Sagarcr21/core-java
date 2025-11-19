package com.xworkz.access.external;

import com.xworkz.access.internal.Hotel;

public class Resort {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(5000, "Blue Lagoon", true, 'A');
        System.out.println("The hotel name is " + hotel1.name);
        System.out.println("The price of the hotel is " + hotel1.price);
        System.out.println("The hotel is available: " + hotel1.isAvailable);
        System.out.println("The hotel rating is " + hotel1.rating);

        System.out.println("----------");

        Hotel hotel2 = new Hotel(8000, "Palm Paradise", false, 'B');
        hotel2.isAvailable = true;  // modifying directly
        System.out.println("The hotel name is " + hotel2.name);
        System.out.println("The price of the hotel is " + hotel2.price);
        System.out.println("The hotel is available: " + hotel2.isAvailable);
        System.out.println("The hotel rating is " + hotel2.rating);

        System.out.println("----------");

        Hotel hotel3 = new Hotel(10000, "Ocean Breeze", true, 'S');
        System.out.println("The hotel name is " + hotel3.name);
        System.out.println("The price of the hotel is " + hotel3.price);
        System.out.println("The hotel is available: " + hotel3.isAvailable);
        System.out.println("The hotel rating is " + hotel3.rating);
    }
}
