package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Planet;

class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("Earth: No-Args Constructor");
    }

    public Earth(String name) {
        super(name);
        System.out.println("Earth: Parameterized Constructor");
    }

    @Override
    public void size() { System.out.println("Size: 510 million km²"); }

    @Override
    public void population() { System.out.println("Population: 8 billion"); }
}


