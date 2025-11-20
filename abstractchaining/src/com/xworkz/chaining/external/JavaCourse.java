package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.Course;

public class JavaCourse extends Course {

    public JavaCourse() {
        super();
        System.out.println("JavaCourse: No-Args Constructor");
    }

    public JavaCourse(String name) {
        super(name);
        System.out.println("JavaCourse: Parameterized Constructor");
    }

    @Override
    public void duration() { System.out.println("Duration: 3 months"); }

    @Override
    public void fee() { System.out.println("Fee: ₹15,000"); }
}
