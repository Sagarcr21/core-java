package com.xworkz.packages.external;

import com.xworkz.packages.internal.Bank;

public class SBI implements Bank {

    public void bankName() { System.out.println("Bank Name === " + name); }
    public void bankInterest() { System.out.println("Interest Rate === " + interestRate); }
    public void bankType() { System.out.println("Is Nationalized === " + isNationalized); }
    public void bankBranches() { System.out.println("Total Branches === " + branches); }
    public void bankService() { System.out.println("Service Type === " + service); }

    public static void main(String[] args) {
        SBI s = new SBI();
        s.bankName();
        s.bankInterest();
        s.bankType();
        s.bankBranches();
        s.bankService();
    }
}
