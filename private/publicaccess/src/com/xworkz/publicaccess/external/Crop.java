package com.xworkz.access.external;

import com.xworkz.access.internal.Farmer;

public class Crop {
    public static void main(String[] args) {

        Farmer f1 = new Farmer("Ramesh", "Wheat", 5, true);
        System.out.println("Farmer name: " + f1.name);
        System.out.println("Crop type: " + f1.cropType);
        System.out.println("Acres: " + f1.acres);
        System.out.println("Organic: " + f1.isOrganic);

        System.out.println("----------");

        Farmer f2 = new Farmer("Suresh", "Rice", 10, false);
        System.out.println("Farmer name: " + f2.name);
        System.out.println("Crop type: " + f2.cropType);
        System.out.println("Acres: " + f2.acres);
        System.out.println("Organic: " + f2.isOrganic);
    }
}

