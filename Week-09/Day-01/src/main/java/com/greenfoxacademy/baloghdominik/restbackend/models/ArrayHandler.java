package com.greenfoxacademy.baloghdominik.restbackend.models;

import java.util.ArrayList;

public class ArrayHandler {
    private String what;
    private ArrayList<Integer> numbers;

    public ArrayHandler(){

    }

    public ArrayHandler(String what, ArrayList<Integer> numbers){
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
