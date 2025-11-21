package com.xworkz.packages.internal;

public interface School {

    public static final String name = "Government School";
    public static final int teachers = 40;
    public static final int students = 800;
    public static final String location = "Bangalore";
    public static final boolean isPublic = true;

    public abstract void schoolName();
    public abstract void schoolTeachers();
    public abstract void schoolStudents();
    public abstract void schoolLocation();
    public abstract void isPublicSchool();
}

