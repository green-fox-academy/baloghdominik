package com.greenfoxacademy.baloghdominik.groot.services;

import com.greenfoxacademy.baloghdominik.groot.models.Groot;
import org.springframework.stereotype.Service;

@Service
public class GrootService {

    public Groot checkMessage(String message){
            return new Groot(message);
    }

    public Groot errorMessage(){
        Groot groot = new Groot();
        groot.setError("I am Groot!");
        return groot;
    }
}
