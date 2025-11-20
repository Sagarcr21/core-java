package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Animal;

public class Dog extends Animal {
    public Dog(int price){
        super( price);
    }
    public Dog(String name,boolean isAvailable){
        super(name,isAvailable);
    }

    @Override
    public void type() {
        System.out.println("the animal type is Dog");
    }

    @Override
    public void eat() {
        System.out.println("the dog eats a non veg");
    }

    @Override
    public void sound() {
        System.out.println("dog barhs loudly");
    }

    @Override
    public void breed() {
        System.out.println("the dogb breed is Daborman");

    }

    @Override
    public void walks() {
        System.out.println("the dog walks speedly");
    }



}
