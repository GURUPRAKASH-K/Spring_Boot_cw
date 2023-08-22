package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.EmpMod;
import com.example.demo.repository.EmpRepo;

@Service
public class Empservice {
		@Autowired
		EmpRepo sr;
public EmpMod saveas(EmpMod ss)
{
	return sr.save(ss);
}
public List<EmpMod> showas()
{
	return sr.findAll();
	}
}
