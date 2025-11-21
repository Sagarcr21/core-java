package com.xworkz.packages.external;

import com.xworkz.packages.internal.Hospital;

public class Apollo implements Hospital {

    public void hospitalName() { System.out.println("Hospital Name === " + name); }
    public void hospitalBeds() { System.out.println("Total Beds === " + beds); }
    public void hospitalEmergency() { System.out.println("Emergency Available === " + emergency); }
    public void hospitalLocation() { System.out.println("Location === " + location); }
    public void hospitalSpecialization() { System.out.println("Specialization === " + specialization); }

    public static void main(String[] args) {
        Apollo a = new Apollo();
        a.hospitalName();
        a.hospitalBeds();
        a.hospitalEmergency();
        a.hospitalLocation();
        a.hospitalSpecialization();
    }
}

