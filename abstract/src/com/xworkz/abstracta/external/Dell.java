package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Laptop;

public class Dell extends Laptop {

    @Override
    public void brand() {
        System.out.println("Brand: Dell");
    }

    @Override
    public void ram() {
        System.out.println("RAM: 16GB");
    }

    @Override
    public void processor() {
        System.out.println("Processor: i7");
    }

    @Override
    public void storage() {
        System.out.println("Storage: 512GB SSD");
    }

    @Override
    public void price() {
        System.out.println("Price: 70,000");
    }




}
