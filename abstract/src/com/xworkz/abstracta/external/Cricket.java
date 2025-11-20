package com.xworkz.abstracta.external;

import com.xworkz.abstracta.internal.Game;

public class Cricket extends Game {
    @Override
    public void players() { System.out.println("Players: 11 per team"); }
    @Override
    public void duration() { System.out.println("Duration: 50 overs"); }
}
