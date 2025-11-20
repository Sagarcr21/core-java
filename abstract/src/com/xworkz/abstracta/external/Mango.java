package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Fruit;

public class Mango extends Fruit {

    @Override
    public void name() {
        System.out.println("Fruit Name: Mango");
    }

    @Override
    public void color() {
        System.out.println("Color: Yellow");
    }

    @Override
    public void taste() {
        System.out.println("Taste: Sweet");
    }

    @Override
    public void calories() {
        System.out.println("Calories: 60 kcal");
    }

    @Override
    public void origin() {
        System.out.println("Origin: India");
    }




}
