package com.xworkz.abstracta.internal;



public abstract class Game {
    public void start() { System.out.println("Game started"); }
    public static void type() { System.out.println("Type: Outdoor"); }

    public abstract void players();
    public abstract void duration();
}







