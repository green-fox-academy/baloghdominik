package com.greenfoxacademy.bankofsimba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BankofsimbaApplication {

	@RequestMapping(value="/hello")
	@ResponseBody
	public String sayHello(){
		return "HELLO!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BankofsimbaApplication.class, args);
	}
}
