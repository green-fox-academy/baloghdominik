package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import com.greenfoxacademy.baloghdominik.restbackend.models.ArrayHandler;
import com.greenfoxacademy.baloghdominik.restbackend.models.ArrayResult;
import com.greenfoxacademy.baloghdominik.restbackend.models.ErrorMsg;
import com.greenfoxacademy.baloghdominik.restbackend.services.ArrayHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

    private ArrayHandlerService arrayHandlerService;

    @Autowired
    public void DoUntilService(){
        this.arrayHandlerService = new ArrayHandlerService();
    }

    @PostMapping(value = "/arrays")
    public Object doUntil(@RequestBody ArrayHandler arrayHandler){
        if (arrayHandler != null && arrayHandler.getWhat().equals("sum")) {
            return new ArrayResult(arrayHandlerService.Summery(arrayHandler));
        } else if (arrayHandler != null && arrayHandler.getWhat().equals("factor")) {
            return new ArrayHandler(arrayHandler.getWhat(), arrayHandlerService.Factor(arrayHandler));
        } else {
            return new ErrorMsg("Please provide what to do with the numbers!");
        }
    }
}
