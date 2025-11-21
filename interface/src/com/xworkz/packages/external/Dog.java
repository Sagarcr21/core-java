package com.xworkz.packages.external;

import com.xworkz.packages.internal.Animal;

public class Dog implements Animal {

    public void animalType() { System.out.println("Animal type === " + type); }
    public void petType() { System.out.println("Is Pet === " + isPet); }
    public void animalLegs() { System.out.println("Legs === " + legs); }
    public void animalSound() { System.out.println("Sound === " + sound); }
    public void animalColor() { System.out.println("Color === " + color); }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalType();
        d.petType();
        d.animalLegs();
        d.animalSound();
        d.animalColor();
    }
}

