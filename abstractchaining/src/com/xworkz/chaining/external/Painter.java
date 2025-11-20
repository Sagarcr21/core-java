package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Artist;

class Painter extends Artist {

    public Painter() {
        super();
        System.out.println("Painter: No-Args Constructor");
    }

    public Painter(String name) {
        super(name);
        System.out.println("Painter: Parameterized Constructor");
    }

    @Override
    public void style() { System.out.println("Style: Watercolor"); }

    @Override
    public void experience() { System.out.println("Experience: 8 years"); }
}


