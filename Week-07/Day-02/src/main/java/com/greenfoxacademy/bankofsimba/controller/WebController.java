package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.ArrayList;

@Controller
public class WebController {

    @RequestMapping("/show")
    public String show(Model model) {
        BankAccount bankAccount = new BankAccount("Simba", "Lion", 2000, true);
        model.addAttribute("name", bankAccount.getName());
        model.addAttribute("type", bankAccount.getAnimalType());
        DecimalFormat df = new DecimalFormat("#.00");
        String balance = df.format(bankAccount.getBalance());
        model.addAttribute("balance", balance);
        model.addAttribute("currency", bankAccount.getCurrency());
        return "show";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        bankAccounts.add(new BankAccount("Simba", "Lion", 2000, true));
        bankAccounts.add(new BankAccount("MuFASZA", "Lion", 25000, true));
        bankAccounts.add(new BankAccount("Zordon", "Lion", 1000000, false));
        bankAccounts.add(new BankAccount("Timon", "Meerkat", 7, true));
        bankAccounts.add(new BankAccount("Pumba", "Warthog", 5, true));

        model.addAttribute("accounts", bankAccounts);
        return "list";
    }

    @RequestMapping("/text")
    public String text(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "text";
    }
}
