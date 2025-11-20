package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Person;

public class Student extends Person {

    @Override
    public void name() {
        System.out.println("Name: Ravi");
    }

    @Override
    public void age() {
        System.out.println("Age: 21");
    }

    @Override
    public void gender() {
        System.out.println("Gender: Male");
    }

    @Override
    public void job() {
        System.out.println("Job: Student");
    }

    @Override
    public void city() {
        System.out.println("City: Bangalore");
    }




}
