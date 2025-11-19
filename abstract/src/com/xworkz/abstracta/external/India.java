package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Country;

public class India extends Country {

    @Override
    public void name() {
        System.out.println("Country: India");
    }

    @Override
    public void capital() {
        System.out.println("Capital: New Delhi");
    }

    @Override
    public void population() {
        System.out.println("Population: 140 Crores");
    }

    @Override
    public void currency() {
        System.out.println("Currency: Rupee");
    }

    @Override
    public void continent() {
        System.out.println("Continent: Asia");
    }




}
