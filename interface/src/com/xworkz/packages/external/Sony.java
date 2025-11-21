package com.xworkz.packages.external;

import com.xworkz.packages.internal.TV;

public class Sony implements TV {

    public void tvBrand() { System.out.println("TV Brand === " + brand); }
    public void tvSize() { System.out.println("TV Size === " + size); }
    public void tvSmart() { System.out.println("Smart TV === " + smart); }
    public void tvDisplay() { System.out.println("Display Type === " + display); }
    public void tvPrice() { System.out.println("TV Price === " + price); }

    public static void main(String[] args) {
        Sony s = new Sony();
        s.tvBrand();
        s.tvSize();
        s.tvSmart();
        s.tvDisplay();
        s.tvPrice();
    }
}
