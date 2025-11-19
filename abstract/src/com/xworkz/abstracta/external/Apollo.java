package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Hospital;

public class Apollo extends Hospital {

    @Override
    public void doctors() {
        System.out.println("Doctors: 150");
    }

    @Override
    public void beds() {
        System.out.println("Beds: 500");
    }
}

