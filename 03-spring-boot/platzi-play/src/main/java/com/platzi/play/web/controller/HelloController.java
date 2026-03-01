package com.platzi.play.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.play.domain.service.PlatziPlayAIService;
// This indicates 
// That this is a request controller in our application.
@RestController
public class HelloController {
	private final PlatziPlayAIService aiService;
	
	public HelloController(PlatziPlayAIService aiService) {
		this.aiService = aiService;
	}
	
	// Here we are indicating that this controller
	// will get a get request type.
	@GetMapping("/hello")
	public String hello() {
		return this.aiService.generateGreeting();
	}
}
