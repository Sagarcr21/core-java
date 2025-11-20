package com.xworkz.chaining.internal;

public abstract class Job {
    int salary;

    public Job() {
        System.out.println("Job: No-Args Constructor");
    }

    public Job(int salary) {
        this.salary = salary;
        System.out.println("Job: Parameterized Constructor");
    }

    public void apply() { System.out.println("Applying for job..."); }
    public static void category() { System.out.println("Category: IT"); }

    public abstract void role();
    public abstract void workHours();
}




