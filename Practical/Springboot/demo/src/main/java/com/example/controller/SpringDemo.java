package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemo {
	@GetMapping("/hi")
	public String sayHi() {
		
		System.out.println("Hello !!");
		return "Hello, Welcome to Spring Boot World";
		
	}
}
