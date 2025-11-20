package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Gadget;

public class SmartWatch extends Gadget {
    @Override
    public void features() { System.out.println("Features: GPS, Heart Rate"); }
    @Override
    public void battery() { System.out.println("Battery: 18 hours"); }
}
