package com.xworkz.packages.external;

import com.xworkz.packages.internal.Mobile;

public class Samsung implements Mobile {
    @Override
    public void mobilePrice() {
        System.out.println(price);
    }
    @Override
    public void mobileOS() {
        System.out.println(os);
    }
    @Override
    public void mobileNetwork() {
        System.out.println(is5G);
    }


    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.mobilePrice();
        s.mobileOS();
        s.mobileNetwork();
    }
}
