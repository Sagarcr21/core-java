package com.xworkz.packages.internal;

public class Turtle {
    public int price;
    public char series;
    public boolean isAquatic;
    public String age;
    public String name;

    public Turtle(){
        System.out.println("NO args Constructor");
    }
    public Turtle(int price, char series, boolean isAquatic, String age, String name){
        System.out.println("all args constructor");
        this.price = price;
        this.series = series;
        this.isAquatic = isAquatic;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Turtle{price=" + price + " series=" + series +
                " isAquatic=" + isAquatic + " age=" + age + " name=" + name + "}";
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        Turtle other = (Turtle) obj;
        return false;
    }
    @Override
    public int hashCode() {
        int result = 1;
        int prime = 7;


        result = prime * result + price;
        result = prime * result + Character.hashCode(series);
        result = prime * result + Boolean.hashCode(isAquatic);
        result = prime * result + age.hashCode();
        result = prime * result + name.hashCode();
        return result;

    }
}

