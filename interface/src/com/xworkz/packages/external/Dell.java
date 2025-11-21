package com.xworkz.packages.external;


import com.xworkz.packages.internal.Laptop;


public class Dell implements Laptop {
    @Override
    public void laptopPrice() {
        System.out.println("Laptop price: " + price);
    }

    @Override
    public void laptopProcessor() {
        System.out.println("Processor: " + processor);
    }

    @Override
    public void touchSupport() {
        System.out.println("Touch Support: " + isTouch);
    }

    @Override
    public void laptopBrand() {
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {
        Dell d = new Dell();
        d.laptopPrice();
        d.laptopProcessor();
        d.touchSupport();
        d.laptopBrand();
    }
}
