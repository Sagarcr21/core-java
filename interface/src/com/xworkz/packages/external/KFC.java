package com.xworkz.packages.external;

import com.xworkz.packages.internal.Restaurant;

public class KFC implements Restaurant {

    public void restaurantName() { System.out.println("Restaurant Name === " + name); }
    public void restaurantVeg() { System.out.println("Is Veg === " + isVeg); }
    public void restaurantSpecial() { System.out.println("Special Item === " + specialItem); }
    public void restaurantBranches() { System.out.println("Total Branches === " + branches); }
    public void restaurantCuisine() { System.out.println("Cuisine === " + cuisine); }

    public static void main(String[] args) {
        KFC k = new KFC();
        k.restaurantName();
        k.restaurantVeg();
        k.restaurantSpecial();
        k.restaurantBranches();
        k.restaurantCuisine();
    }
}

