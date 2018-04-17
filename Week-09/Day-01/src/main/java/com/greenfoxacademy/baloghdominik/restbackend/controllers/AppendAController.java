package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import com.greenfoxacademy.baloghdominik.restbackend.models.AppendA;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

    @GetMapping("/appenda/{appendable}")
    public Object append(@PathVariable(value = "appendable", required = true) String appendable){
        return new AppendA(appendable);
    }
}
