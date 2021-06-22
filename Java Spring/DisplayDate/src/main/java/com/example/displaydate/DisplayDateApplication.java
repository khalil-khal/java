package com.example.displaydate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DisplayDateApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}


	@RequestMapping("")
	public String index() {
		return "How are you";
	}
	@RequestMapping("/random")
	public String random() {
		return "Random Page";
	}
}