package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
    private String name;
    private String animalType;
    private double balance;
    private String currency;
    private boolean good;

    public BankAccount(String name, String animalType, double balance, boolean good){
        this.animalType = animalType;
        this.name = name;
        this.balance = balance;
        this.currency = "$";
        this.good = good;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMoney() {
        DecimalFormat df = new DecimalFormat("#.00");
        String money = df.format(getBalance()) + getCurrency();
        return money;
    }

    public String isGood() {
        String isgood;
        if (good){
            isgood = "Good one.";
        } else {
            isgood = "Bad guy!";
        }
        return isgood;
    }
}
