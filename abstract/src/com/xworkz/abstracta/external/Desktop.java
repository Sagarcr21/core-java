package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Computer;

public class Desktop extends Computer {
    @Override
    public void cpu() { System.out.println("CPU: Intel i5"); }
    @Override
    public void storage() { System.out.println("Storage: 1TB HDD"); }
}


