package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Shop;

public class SuperMarket extends Shop {
    @Override
    public void products() { System.out.println("Products: 10,000+"); }
    @Override
    public void staff() { System.out.println("Staff: 40"); }
}
