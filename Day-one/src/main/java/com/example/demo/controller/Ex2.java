package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2 {
	
private String name;
	@GetMapping("disp")
	public String Name(){
		name="Guru";
		return "Welcome "+name+"!" ;
	}
}
