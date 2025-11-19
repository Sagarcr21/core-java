package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Movie;

public class KGF extends Movie {

    @Override
    public void title() {
        System.out.println("Movie Title: KGF");
    }

    @Override
    public void director() {
        System.out.println("Director: Prashanth Neel");
    }

    @Override
    public void hero() {
        System.out.println("Hero: Yash");
    }

    @Override
    public void budget() {
        System.out.println("Budget: 80 Crores");
    }

    @Override
    public void language() {
        System.out.println("Language: Kannada");
    }



}
