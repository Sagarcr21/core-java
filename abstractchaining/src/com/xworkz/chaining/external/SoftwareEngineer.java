package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Job;

class SoftwareEngineer extends Job {

    public SoftwareEngineer() {
        super();
        System.out.println("SoftwareEngineer: No-Args Constructor");
    }

    public SoftwareEngineer(int salary) {
        super(salary);
        System.out.println("SoftwareEngineer: Parameterized Constructor");
    }

    @Override
    public void role() { System.out.println("Role: Developer"); }

    @Override
    public void workHours() { System.out.println("Work hours: 8 daily"); }
}


