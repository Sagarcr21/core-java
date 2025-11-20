package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Transport;

public class Metro extends Transport {
    @Override
    public void speed() { System.out.println("Speed: 80 km/h"); }
    @Override
    public void coaches() { System.out.println("Coaches: 6"); }
}


