package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import com.greenfoxacademy.baloghdominik.restbackend.models.Doubling;
import com.greenfoxacademy.baloghdominik.restbackend.models.ErrorMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @RequestMapping("/doubling")
    public Object doubling(@RequestParam(value="input", required = false) Long input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new ErrorMsg("Please provide an input!");
        }
    }
}