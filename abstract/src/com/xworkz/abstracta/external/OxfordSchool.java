package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.School;

public class OxfordSchool extends School {

    @Override
    public void name() {
        System.out.println("School Name: Oxford");
    }

    @Override
    public void principal() {
        System.out.println("Principal: Mr. Kumar");
    }

    @Override
    public void students() {
        System.out.println("Students: 2000");
    }

    @Override
    public void location() {
        System.out.println("Location: Bangalore");
    }

    @Override
    public void gradeLevels() {
        System.out.println("Grades: 1st to 10th");
    }




}
