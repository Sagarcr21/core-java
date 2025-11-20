package com.xworkz.packages.internal;

public class Laptop {
    public String brand;
    public String model;
    public int price;
    public String processor;
    public int ramSize;
    public int storageSize;
    public boolean isTouchscreen;
    public double screenSize;
    public String color;
    public boolean isAvailable;

    // No-args constructor
    public Laptop() {
        System.out.println("No-args Constructor");
    }

    // All-args constructor
    public Laptop(String brand, String model, int price, String processor, int ramSize,
                  int storageSize, boolean isTouchscreen, double screenSize, String color, boolean isAvailable) {
        System.out.println("All-args Constructor");
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.isTouchscreen = isTouchscreen;
        this.screenSize = screenSize;
        this.color = color;
        this.isAvailable = isAvailable;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", isTouchscreen=" + isTouchscreen +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Laptop other = (Laptop) obj;
        return false;

    }


    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;

        result = prime * result + brand.hashCode();
        result = prime * result + model.hashCode();
        result = prime * result + price;
        result = prime * result + processor.hashCode();
        result = prime * result + ramSize;
        result = prime * result + storageSize;
        result = prime * result + Boolean.hashCode(isTouchscreen);
        long temp = Double.doubleToLongBits(screenSize);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + color.hashCode();
        result = prime * result + Boolean.hashCode(isAvailable);

        return result;
    }
}

