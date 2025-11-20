package com.xworkz.access.internal;

public class Farmer {
    public String name;
    public String cropType;
    public int acres;
    public boolean isOrganic;

    public Farmer(String name, String cropType, int acres, boolean isOrganic) {
        this.name = name;
        this.cropType = cropType;
        this.acres = acres;
        this.isOrganic = isOrganic;
    }
}

