package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.University;

public class VTU extends University {

    @Override
    public void branches() {
        System.out.println("Branches: 20");
    }

    @Override
    public void studentsCount() {
        System.out.println("Students: 50,000");
    }
}

