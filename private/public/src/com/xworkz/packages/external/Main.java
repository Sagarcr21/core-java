package com.xworkz.packages.external;

import com.xworkz.packages.internal.Car;

public class Main {
    public static void main(String[] args) {


        Car c= new Car("DH","JH",2019,"BLUE",353,true,123,"hs",56,"dhf");
        System.out.println(c.toString());
        Car car= new Car("DH","JH",2019,"BLUE",353,true,123,"hs",56,"dhf");
        System.out.println(car.equals(c));
        System.out.println(car.hashCode());
    }
}
