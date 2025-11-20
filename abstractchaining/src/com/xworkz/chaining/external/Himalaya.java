package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Mountain;

class Himalaya extends Mountain {

    public Himalaya() {
        super();
        System.out.println("Himalaya: No-Args Constructor");
    }

    public Himalaya(int height) {
        super(height);
        System.out.println("Himalaya: Parameterized Constructor");
    }

    @Override
    public void climate() { System.out.println("Climate: Cold"); }

    @Override
    public void peaks() { System.out.println("Major Peak: Everest"); }
}




