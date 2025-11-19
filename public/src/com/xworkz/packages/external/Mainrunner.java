package com.xworkz.packages.external;

import com.xworkz.packages.internal.*;


public class Mainrunner {

    public static void main(String[] args){
        System.out.println("\n------ DOG DETAILS ------");
        Dog c=new Dog();
        System.out.println(c.toString());
        Dog dog=new Dog(1000,'G',true,"2","Dabour C");
        System.out.println(dog.toString());
        System.out.println(dog.equals(c));
        System.out.println(dog.equals(dog));
        System.out.println(dog.hashCode());
        System.out.println("\n------ HORSE DETAILS ------");
        Horse horse1 = new Horse();
        System.out.println(horse1.toString());
        Horse horse2 = new Horse(60, "Arabian", true, 5.5, 'H');
        System.out.println(horse2.toString());
        System.out.println(horse1.equals(horse1));
        System.out.println(horse2.hashCode());


        System.out.println("\n------ SNAKE DETAILS ------");
        Snake snake1 = new Snake();
        System.out.println(snake1.toString());
        Snake snake2 = new Snake("Cobra", 5, true, 2.3f, 'S');
        System.out.println(snake2.toString());
        System.out.println(snake2.equals(snake1));
        System.out.println(snake2.hashCode());

        System.out.println("\n------ FISH DETAILS ------");
        Fish fish1 = new Fish();
        System.out.println(fish1.toString());
        Fish fish2 = new Fish("Goldfish", 10.5, true, 400, 'G');
        System.out.println(fish2.toString());
        System.out.println(fish2.equals(fish1));

        System.out.println("\n------ BIRD DETAILS ------");
        Bird bird1 = new Bird();
        System.out.println(bird1.toString());
        Bird bird2 = new Bird(1.2f, "Parrot", true, 5, 'P');
        System.out.println(bird2.toString());
        System.out.println(bird2.equals(bird1));
        System.out.println(bird2.hashCode());

        System.out.println("\n------ ELEPHANT DETAILS ------");
        Elephant e = new Elephant();
        System.out.println(e.toString());
        Elephant elephant = new Elephant(9000, 'E', true, "12", "Ganesha");
        System.out.println(elephant.toString());
        System.out.println(elephant.equals(e));
        System.out.println(elephant.equals(elephant));
        System.out.println(elephant.hashCode());

        System.out.println("\n------ COW DETAILS ------");
        Cow cow1 = new Cow();
        System.out.println(cow1.toString());
        Cow cow = new Cow(4000, 'C', true, "5", "Jersey");
        System.out.println(cow.toString());
        System.out.println(cow.equals(cow1));
        System.out.println(cow.equals(cow));
        System.out.println(cow.hashCode());

        System.out.println("\n------ FOX DETAILS ------");
        Fox f = new Fox();
        System.out.println(f.toString());
        Fox fox = new Fox(1500, 'F', true, "3", "RedFox");
        System.out.println(fox.toString());
        System.out.println(fox.equals(f));
        System.out.println(fox.equals(fox));
        System.out.println(fox.hashCode());

        System.out.println("\n------ TIGER DETAILS ------");
        Tiger t = new Tiger();
        System.out.println(t.toString());
        Tiger tiger = new Tiger(9000, 'T', true, "6", "Shera");
        System.out.println(tiger.toString());
        System.out.println(tiger.equals(t));
        System.out.println(tiger.equals(tiger));
        System.out.println(tiger.hashCode());

        System.out.println("\n------ RABBIT DETAILS ------");
        Rabbit r = new Rabbit();
        System.out.println(r.toString());
        Rabbit rabbit = new Rabbit(600, 'R', true, "2", "Bunny");
        System.out.println(rabbit.toString());
        System.out.println(rabbit.equals(r));
        System.out.println(rabbit.equals(rabbit));
        System.out.println(rabbit.hashCode());

        System.out.println("\n------ TURTLE DETAILS ------");
        Turtle turtle1 = new Turtle();
        System.out.println(turtle1.toString());
        Turtle turtle = new Turtle(1200, 'T', true, "10", "Leonardo");
        System.out.println(turtle.toString());
        System.out.println(turtle.equals(turtle1));
        System.out.println(turtle.equals(turtle));
        System.out.println(turtle.hashCode());

        System.out.println("\n------ PARROT DETAILS ------");
        Parrot parrot1 = new Parrot();
        System.out.println(parrot1.toString());
        Parrot parrot = new Parrot(700, 'P', true, "2", "Mithu");
        System.out.println(parrot.toString());
        System.out.println(parrot.equals(parrot1));
        System.out.println(parrot.equals(parrot));
        System.out.println(parrot.hashCode());

        System.out.println("\n------ DUCK DETAILS ------");
        Duck d = new Duck();
        System.out.println(d.toString());
        Duck duck = new Duck(500, 'D', true, "1", "Donald");
        System.out.println(duck.toString());
        System.out.println(duck.equals(d));
        System.out.println(duck.equals(duck));
        System.out.println(duck.hashCode());

        System.out.println("\n------ PANDA DETAILS ------");
        Panda panda1 = new Panda();
        System.out.println(panda1.toString());
        Panda panda = new Panda(3000, 'P', false, "6", "Po");
        System.out.println(panda.toString());
        System.out.println(panda.equals(panda1));
        System.out.println(panda.equals(panda));
        System.out.println(panda.hashCode());




    }
}
