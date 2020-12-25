package com.example.pizzeria;

public class Drink {
    private String name;
    private String description;



    public static final Drink[] drinks = {
            new Drink("Cola", "Fresh soda"),
            new Drink("Sprite", "Fresh soda 2"),
            new Drink("Fanta", "Fresh soda 3")
    };


    private Drink(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }


}
