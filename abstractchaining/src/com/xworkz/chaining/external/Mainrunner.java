package com.xworkz.chaining.external;

import com.xworkz.chaining.internal.*;

public class Mainrunner {
    public  static  void main(String [] arhs){
        Instrument.category();
        System.out.println("one args constructor");
        Guitar g= new Guitar(1255);
        g.soundOutput();
        g.type();
        g.play();
        System.out.println("two args constructor");
        Guitar g1=new Guitar(6462,true);
        g1.play();
        g1.type();
        g1.soundOutput();
        System.out.println("buiding details-----");
        Building.category();
        Apartment a = new Apartment(10, 40);
        a.openGate();
        a.rooms();
        a.area();
        System.out.println("course details------");

        Course.type();
        JavaCourse c = new JavaCourse("Core Java");
        c.start();
        c.duration();
        c.fee();
        System.out.println("earth details----");
        Planet.galaxy();
        Earth e = new Earth("Earth");
        e.rotate();
        e.size();
        e.population();
        System.out.println("sogtware engineer----");
        Job.category();
        SoftwareEngineer s = new SoftwareEngineer(70000);
        s.apply();
        s.role();
        s.workHours();
        System.out.println("fruits=====");
        Fruit.type();
        Mango m = new Mango("Yellow");
        m.taste();
        m.season();
        m.price();
        System.out.println("festival===");
        Festival.country();
        Diwali d = new Diwali("Deepavali");
        d.celebrate();
        d.duration();
        d.specialty();
        System.out.println("mountain===");
        Mountain.region();
        Himalaya h = new Himalaya(8848);
        h.view();
        h.climate();
        h.peaks();
        System.out.println("Drinks====");
        Drink.type();
        Tea t = new Tea(250);
        t.serve();
        t.flavor();
        t.price();
        System.out.println("painter");
        Artist.field();
        Painter p = new Painter("Vinod");
        p.work();
        p.style();
        p.experience();



    }
}
