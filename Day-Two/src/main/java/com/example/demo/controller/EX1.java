package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EX1 {
	@Value("${var}")
	
private String name;
	@Value("${var1}")
	private int age;
	@GetMapping("disp")
	public String Control()
	{
		return "my name is "+name+".my age is "+age;
	}
}
