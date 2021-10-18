package com.m3.Hw807;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hw807Application {

	@GetMapping("/")
	public String msg()
	{
		return "Hello World!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Hw807Application.class, args);
	}

}
