package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Festival;

class Diwali extends Festival {
    public Diwali() {
        super();
        System.out.println("Diwali: No-Args Constructor");
    }

    public Diwali(String name) {
        super(name);
        System.out.println("Diwali: Parameterized Constructor");
    }

    @Override
    public void duration() { System.out.println("Duration: 5 days"); }

    @Override
    public void specialty() { System.out.println("Specialty: Lights & Firecrackers"); }
}


