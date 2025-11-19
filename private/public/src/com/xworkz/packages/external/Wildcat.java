package com.xworkz.packages.external;

import com.xworkz.packages.internal.Cat;




public class Wildcat extends Cat {

    protected Wildcat(int price, char series, boolean isAvailable, String age, String name) {
        super(price, series, isAvailable, age, name);
    }
    public static void main(String[] args){


        Wildcat cat=new Wildcat(1000,'G',true,"2","Wild Cat");
        System.out.println(cat.toString());
    }
}

