package com.xworkz.mobile.external;

import com.xworks.pakages.internal.*;



public class Phone implements ModelInfo, CompanyInfo, BatteryInfo, CameraInfo,
        StorageInfo, RAMInfo, DisplayInfo, NetworkInfo, PriceDetails, ColorDetails {

    @Override
    public String Model() {
        return "Galaxy S22";
    }

    @Override
    public String Company() {
        return "Samsung";
    }

    @Override
    public int BatteryCapacity() {
        return 4500;
    }

    @Override
    public int CameraMP() {
        return 108;
    }

    @Override
    public int Storage() {
        return 256;
    }

    @Override
    public int RAM() {
        return 12;
    }

    @Override
    public float DisplaySize() {
        return 6.6f;
    }

    @Override
    public String NetworkType() {
        return "5G";
    }

    @Override
    public int Price() {
        return 79999;
    }

    @Override
    public String Color() {
        return "Phantom Black";
    }

    public static void main(String[] args) {

        Phone mobile = new Phone();

        System.out.println("Model: " + mobile.Model());
        System.out.println("Company: " + mobile.Company());
        System.out.println("Battery: " + mobile.BatteryCapacity());
        System.out.println("Camera: " + mobile.CameraMP());
        System.out.println("Storage: " + mobile.Storage());
        System.out.println("RAM: " + mobile.RAM());
        System.out.println("Display: " + mobile.DisplaySize());
        System.out.println("Network: " + mobile.NetworkType());
        System.out.println("Price: " + mobile.Price());
        System.out.println("Color: " + mobile.Color());
    }
}
