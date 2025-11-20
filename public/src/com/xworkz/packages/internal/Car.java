package com.xworkz.packages.internal;

public class Car {

    public String brand;
    public String model;
    public int year;
    public String color;
    public float price;
    public boolean isAvailable;
    public float mileage;
    public String engineType;
    public int seatingCapacity;
    public String registrationNumber;


    public Car(String brand, String model, int year, String color, float price,
               boolean isAvailable, float mileage, String engineType,
               int seatingCapacity, String registrationNumber) {

        System.out.println("All-args Constructor");
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
        this.mileage = mileage;
        this.engineType = engineType;
        this.seatingCapacity = seatingCapacity;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", mileage=" + mileage +
                ", engineType='" + engineType + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;


      if( obj instanceof Car) {
          Car other = (Car) obj;
          return this.brand.equals(other.brand)&&
                  this.model.equals(other.model)&&
                  this.year==(other.year)&&
                  this.color.equals(other.color)&&
                  this.price==(other.price)&&
                  this.isAvailable==(other.isAvailable)&&
                  this.mileage==(other.mileage)&&
                  this.engineType.equals(other.engineType)&&
                          this.seatingCapacity==(other.seatingCapacity)&&
                          this.registrationNumber.equals(other.registrationNumber);

      }
            return false;
    }
    public int hashCode(){
        int prime=7;
        int result=1;
        result = prime * result + brand.hashCode();
        result = prime * result + model.hashCode();
        result = prime * result + year;
        result = prime * result + color.hashCode();
        result = prime * result + Float.hashCode(price);
        result = prime * result + Boolean.hashCode(isAvailable);
        result = prime * result + Float.hashCode(mileage);
        result = prime * result + engineType.hashCode();
        result = prime * result + seatingCapacity;
        result = prime * result + registrationNumber.hashCode();
        return  result;
    }


}


