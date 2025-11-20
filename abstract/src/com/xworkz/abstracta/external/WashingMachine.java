package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Appliance;

public class WashingMachine extends Appliance {
    @Override
    public void capacity() { System.out.println("Capacity: 7kg"); }
    @Override
    public void type() { System.out.println("Type: Front Load"); }
}
