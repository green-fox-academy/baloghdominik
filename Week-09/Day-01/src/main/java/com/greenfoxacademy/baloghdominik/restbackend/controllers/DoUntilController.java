package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import com.greenfoxacademy.baloghdominik.restbackend.models.DoUntil;
import com.greenfoxacademy.baloghdominik.restbackend.models.ErrorMsg;
import com.greenfoxacademy.baloghdominik.restbackend.models.Until;
import com.greenfoxacademy.baloghdominik.restbackend.services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    private DoUntilService doUntilService;

    @Autowired
    public void DoUntilService(){
        this.doUntilService = new DoUntilService();
    }

    @PostMapping(value = "/dountil/{what}")
    public Object doUntil(@PathVariable(name = "what", required = false) String what, @RequestBody Until until){
        if (what.equals("sum") && until != null) {
            return new DoUntil(doUntilService.Sum(until));
        } else if (what.equals("factor") && until != null && until.getUntil() > 0){
            return new DoUntil(doUntilService.Factor(until));
        } else {
            return new ErrorMsg("Please provide a number!");
        }
    }
}
