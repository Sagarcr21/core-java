package com.xworkz.emmueration.boots;


import com.xworkz.emmueration.emuers.Cat;
import com.xworkz.emmueration.emuers.Country;
import com.xworkz.emmueration.emuers.State;

public class Mainrunner {
    public static void main(String [] args){
        for (Country c : Country.values()) {
            System.out.println(c + " : " + c.getCode() + c.getlanquage());
        }

                for (State s : State.values()) {
                    System.out.println(s + " → " + s.getItCompanies());
                }


                System.out.println("\nMajor IT companies in Karnataka:");
                System.out.println(State.Karnataka.getItCompanies());

        System.out.println("the cat name is ----"+Cat.Bengal+"---and their behaviour is --"+Cat.Bengal.getCatBehaviour());
            }

        }




