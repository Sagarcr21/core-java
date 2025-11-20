package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Device;

public class Television extends Device {
    @Override
    public void screenSize() { System.out.println("Screen Size: 55 inches"); }
    @Override
    public void price() { System.out.println("Price: ₹55,000"); }
}