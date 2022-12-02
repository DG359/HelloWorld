package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot!!";
		
	}
	
	@RequestMapping("/")
	public String sayRoot() {
		return "Web app root";
	}

}
