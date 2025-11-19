package com.xworkz.emmueration.boots;

import com.xworkz.packages.internal.Laptop;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\n------ LAPTOP DETAILS ------");

        Laptop l1 = new Laptop();
        System.out.println(l1.toString());

        Laptop l2 = new Laptop(
                "HP",
                "Pavilion 15",
                65000,
                "Intel i5 12th Gen",
                16,
                512,
                true,
                15.6,
                "Silver",
                true
        );
        System.out.println(l2.toString());

        System.out.println("\nComparisons:");
        System.out.println(l2.equals(l1)); // false
        System.out.println(l2.equals(l2)); // true

        System.out.println("\nHash Code:");
        System.out.println(l2.hashCode());
    }
}

