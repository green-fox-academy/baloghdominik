package com.greenfoxacademy.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BlueColor implements MyColor {

    @Autowired
    Printer printer;

    @Primary
    @Override
    public void printColor() {
        printer.log("blue");
    }
}
