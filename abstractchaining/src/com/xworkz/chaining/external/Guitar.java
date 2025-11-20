package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Instrument;

public class Guitar extends Instrument {

    public Guitar(int price){
        super(price);

    }
    public Guitar(int price,boolean isAvailabe){
        super(price,isAvailabe);

    }

    @Override
    public void type() {
        System.out.println("Type: Acoustic Guitar");
    }

    @Override
    public void soundOutput() {
        System.out.println("Sound Output: Warm and Clear");
    }
}
