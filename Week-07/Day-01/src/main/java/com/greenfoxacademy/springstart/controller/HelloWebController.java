package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong id = new AtomicLong(1);

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"black", "black", "red", "blue", "orange", "purple", "green", "yellow", "cyan", "silver"};

    ArrayList<Integer> sizes = new ArrayList();

    Random rn = new Random();

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        int randomlang = rn.nextInt(hellos.length-1) + 1;
        int randomcolor = rn.nextInt(colors.length-1) + 1;
        for (String hello : hellos) {
            sizes.add(randomlang + 5);
        }

        model.addAttribute("name", " World");
        model.addAttribute("count", id.getAndIncrement());
        model.addAttribute("lang", hellos[randomlang]);
        model.addAttribute("color", colors[randomcolor]);
        model.addAttribute("hellos", hellos);
        model.addAttribute("sizes", sizes);
        model.addAttribute("size", randomlang+5);
        return "greeting";
    }
}
