package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import com.greenfoxacademy.baloghdominik.restbackend.models.ErrorMsg;
import com.greenfoxacademy.baloghdominik.restbackend.models.Greeter;
import com.greenfoxacademy.baloghdominik.restbackend.services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @RequestMapping(value = {"/greeter"})
    public Object greeter(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "title", required = false) String title){
        if (title != null && name != null) {
            return new Greeter(name, title);
        } else if(name != null && title == null) {
            return new ErrorMsg("Please provide a title!");
        } else {
            return new ErrorMsg("Please provide a name!");
        }
    }
}
