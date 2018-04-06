package com.greenfoxacademy.baloghdominik.programmerfoxclub.controllers;

import com.greenfoxacademy.baloghdominik.programmerfoxclub.models.User;
import com.greenfoxacademy.baloghdominik.programmerfoxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {

    @Autowired
    public MainControllers(UserService userService) {
        this.userService = userService;
    }

/*    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("loggedin", "false");
        return "index";
    }*/

    private UserService userService;

    @RequestMapping("/")
    public String loggedInIndex(@RequestParam(name = "name", required = false) String username, Model model) {
        User user = userService.login(username);
        if (username != null && user != null) {
            model.addAttribute("name", userService.getUser(username).getName());
            model.addAttribute("food", userService.getUser(username).getFood());
            model.addAttribute("drink", userService.getUser(username).getDrink());
            model.addAttribute("tricks", userService.getUser(username).getTricks());
            return "index";
        } else {
            return "redirect:/login";
        }
    }
}
