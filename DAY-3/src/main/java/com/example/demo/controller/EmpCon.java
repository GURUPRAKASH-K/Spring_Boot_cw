package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmpMod;
import com.example.demo.service.Empservice;

@RestController

public class EmpCon {
@Autowired
Empservice sser;
@PostMapping("guru")
public EmpMod info(@RequestBody EmpMod ss)
{
	return sser.saveas(ss);
}
@GetMapping("disp")
public List<EmpMod> sh()
{
	return sser.showas();
}
}
