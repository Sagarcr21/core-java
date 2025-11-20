package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Bird;

public class Parrot extends Bird {

    @Override
    public void name() {
        System.out.println("Bird: Parrot");
    }

    @Override
    public void color() {
        System.out.println("Color: Green");
    }

    @Override
    public void sound() {
        System.out.println("Sound: Screech");
    }

    @Override
    public void fly() {
        System.out.println("Flying: Yes");
    }

    @Override
    public void food() {
        System.out.println("Food: Fruits & seeds");
    }




}
