package com.xworkz.packages.external;

import com.xworkz.packages.internal.School;

public class GovernmentSchool implements School {

    public void schoolName() { System.out.println("School Name === " + name); }
    public void schoolTeachers() { System.out.println("Teachers === " + teachers); }
    public void schoolStudents() { System.out.println("Students === " + students); }
    public void schoolLocation() { System.out.println("Location === " + location); }
    public void isPublicSchool() { System.out.println("Is Public School === " + isPublic); }

    public static void main(String[] args) {
        GovernmentSchool g = new GovernmentSchool();
        g.schoolName();
        g.schoolTeachers();
        g.schoolStudents();
        g.schoolLocation();
        g.isPublicSchool();
    }
}

