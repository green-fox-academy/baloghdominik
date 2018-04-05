package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {
    @Autowired
    Printer printer;

    @Autowired
    MyColor myColor;

    @Autowired
    UtilityService utilityService;

	public static void main(String[] args) {
		SpringApplication.run(DependenciesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    printer.log("hello");
	    myColor.printColor();
	}
}
