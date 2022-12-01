package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(DemoApplication.class);
		
		application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		application.run(args);
		
		System.out.println("<<< App Started >>>>");
	}

}
 