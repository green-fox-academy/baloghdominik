package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.EmailFormatValidator;
import com.greenfoxacademy.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    UtilityService utilityService;

    @RequestMapping("/useful")
    public String useful(Model model) {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String email(Model model, @RequestParam(value="email",required=true) String email) {
        model.addAttribute("email", email);
        EmailFormatValidator emailFormatValidator = new EmailFormatValidator();
        if (emailFormatValidator.validate(email)){
            model.addAttribute("text", "Your email is valid!");
            model.addAttribute("color", "green");
        } else {
            model.addAttribute("text", "Your email is not valid!");
            model.addAttribute("color", "red");
        }
        return "email";
    }
}
