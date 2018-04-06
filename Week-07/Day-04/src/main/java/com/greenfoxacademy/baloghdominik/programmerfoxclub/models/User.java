package com.greenfoxacademy.baloghdominik.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String food;
    private String drink;
    private List<String> tricks;

    public User(String name){
        this.name = name;
        food = "Pizza";
        drink = "Lemonade";
        tricks = new ArrayList<>();
        tricks.add("Write HTML");
        tricks.add("Code in Java");

    }

    public String getName() {
        return this.name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<String> getTricks() {
        return tricks;
    }
}
