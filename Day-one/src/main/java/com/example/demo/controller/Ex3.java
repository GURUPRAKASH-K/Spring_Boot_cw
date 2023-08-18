package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3 {
private String color;
	@GetMapping("disp1")
	public String Color()
	{
		color="Blue";
		return "My favorite color is "+color;
	}
}
