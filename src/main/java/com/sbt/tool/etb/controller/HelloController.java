package com.sbt.tool.etb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured/welcome")
public class HelloController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to the world of spring security";
		
	}
	
}
