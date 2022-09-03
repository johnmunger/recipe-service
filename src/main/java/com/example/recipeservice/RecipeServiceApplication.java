package com.example.recipeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class RecipeServiceApplication {

	public static void main(String[] args) {
		try {
		SpringApplication.run(RecipeServiceApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
