package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("user") String name){
        Greeting greeting = new Greeting(1, "Hello, "+name);
        return greeting;
    }
}
