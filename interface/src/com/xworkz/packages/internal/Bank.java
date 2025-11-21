package com.xworkz.packages.internal;



public interface Bank {

    public static final String name = "SBI";
    public static final float interestRate = 6.5f;
    public static final boolean isNationalized = true;
    public static final int branches = 2000;
    public static final String service = "Savings A/C";

    public abstract void bankName();
    public abstract void bankInterest();
    public abstract void bankType();
    public abstract void bankBranches();
    public abstract void bankService();
}

