package com.helloworld.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HelloWorldApplication {
	
	@GetMapping("/hello")
	public String helloWorld() {
		
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
	}

}
