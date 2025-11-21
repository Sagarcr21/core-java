package com.xworkz.packages.internal;

public interface Restaurant {

    public static final String name = "KFC";
    public static final boolean isVeg = false;
    public static final String specialItem = "Zinger Burger";
    public static final int branches = 950;
    public static final String cuisine = "Fast Food";

    public abstract void restaurantName();
    public abstract void restaurantVeg();
    public abstract void restaurantSpecial();
    public abstract void restaurantBranches();
    public abstract void restaurantCuisine();
}
