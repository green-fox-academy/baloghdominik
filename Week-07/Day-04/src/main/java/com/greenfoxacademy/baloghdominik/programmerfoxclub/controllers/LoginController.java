package com.greenfoxacademy.baloghdominik.programmerfoxclub.controllers;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.services.UserService;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.temp.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("isValid", "false");
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(name = "name") String username, Model model) {
        User user = userService.login(username);
        if (user != null) {
            Util.loggedInUser = user;
            return "redirect:/?name="+username;
        } else {
            model.addAttribute("isValid", "true");
            return "login";
        }
    }

}
