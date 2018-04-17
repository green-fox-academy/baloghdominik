package com.greenfoxacademy.baloghdominik.restbackend.services;

import com.greenfoxacademy.baloghdominik.restbackend.models.Until;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {

    public int Sum(Until until){
        int num = 1;
        for (int k = 2; k < until.getUntil()+1; k++){
            num += k;
        }
        return num;
    }

    public int Factor(Until until){
        int num = 1;
        for (int k = 2; k < until.getUntil()+1; k++){
            num *= k;
        }
        return num;
    }
}
