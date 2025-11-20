package com.xworkz.chaining.external;
import com.xworkz.chaining.internal.Fruit;

class Mango extends Fruit {

    public Mango() {
        super();
        System.out.println("Mango: No-Args Constructor");
    }

    public Mango(String color) {
        super(color);
        System.out.println("Mango: Parameterized Constructor");
    }

    @Override
    public void season() { System.out.println("Season: Summer"); }

    @Override
    public void price() { System.out.println("Price: ₹120/kg"); }
}

