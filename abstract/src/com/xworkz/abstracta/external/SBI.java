package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Bank;

public class SBI extends Bank {

    @Override
    public void name() {
        System.out.println("Bank: SBI");
    }

    @Override
    public void branch() {
        System.out.println("Branch: MG Road");
    }

    @Override
    public void ifsc() {
        System.out.println("IFSC: SBIN000123");
    }

    @Override
    public void location() {
        System.out.println("Location: Bangalore");
    }

    @Override
    public void services() {
        System.out.println("Services: Loans, Deposits, Cards");
    }




}
