package com.xworkz.access.external;

import com.xworkz.access.internal.Hotel;

class Restaurant extends Hotel {

    protected Restaurant(int price, String name, boolean isOpen, char grade) {
        super(price, name, isOpen, grade);
    }

    public static void main(String[] args) {

        Restaurant res1 = new Restaurant(2000, "BBQ Nation", true, 'A');
        System.out.println("Details of Restaurant 1:");
        System.out.println("The price of the hotel is " + res1.price);
        System.out.println("The name of the hotel is " + res1.name);
        System.out.println("The hotel is open: " + res1.isOpen);
        System.out.println("The hotel grade is " + res1.grade); // can’t access private members directly, only through method

        System.out.println("----------");

        Restaurant res2 = new Restaurant(1500, "Taj Dine", false, 'B');
        System.out.println("Details of Restaurant 2:");
        System.out.println("The price of the hotel is " + res2.price);
        System.out.println("The name of the hotel is " + res2.name);
        System.out.println("The hotel is open: " + res2.isOpen);
        System.out.println("The hotel grade is " + res2.grade);

        System.out.println("----------");

        Restaurant res3 = new Restaurant(1000, "Spice Garden", true, 'C');
        System.out.println("Details of Restaurant 3:");
        System.out.println("The price of the hotel is " + res3.price);
        System.out.println("The name of the hotel is " + res3.name);
        System.out.println("The hotel is open: " + res3.isOpen);
        System.out.println("The hotel grade is " + res3.grade);
    }
}

