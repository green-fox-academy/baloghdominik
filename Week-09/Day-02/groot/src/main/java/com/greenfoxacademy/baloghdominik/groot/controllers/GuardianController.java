package com.greenfoxacademy.baloghdominik.groot.controllers;

import com.greenfoxacademy.baloghdominik.groot.models.Groot;
import com.greenfoxacademy.baloghdominik.groot.models.Yondu;
import com.greenfoxacademy.baloghdominik.groot.services.GrootService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value = "/groot")
    public Groot groot(@RequestParam(value = "message", required = false) String message){
        GrootService grootService = new GrootService();
        if (message != null){
            return grootService.checkMessage(message);
        } else {
            return grootService.errorMessage();
        }
    }

    @GetMapping(value = "/yondu")
    public Yondu yondu(@RequestParam(value = "distance", required = true) String distance, @RequestParam(value = "time", required = true) String time){
        if (distance != null && time != null && Float.parseFloat(time) > 0){
            return new Yondu(distance, time);
        } else {
            return new Yondu();
        }
    }
}
