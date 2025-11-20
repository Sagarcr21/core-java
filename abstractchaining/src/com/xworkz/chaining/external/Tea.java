package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Drink;

class Tea extends Drink {

    public Tea() {
        super();
        System.out.println("Tea: No-Args Constructor");
    }

    public Tea(int quantity) {
        super(quantity);
        System.out.println("Tea: Parameterized Constructor");
    }

    @Override
    public void flavor() { System.out.println("Flavor: Masala"); }

    @Override
    public void price() { System.out.println("Price: ₹15"); }
}



