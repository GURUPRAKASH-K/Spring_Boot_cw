package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.Serv;

@RestController
public class Cont {
@Autowired
Serv sser;
@PostMapping("put")
public List<Model> show(@RequestBody List<Model> ss)
{
	return sser.showinfo(ss);
}
@GetMapping("get")
public List<Model> get()
{
	return sser.getinfo();
	
}
@GetMapping("get1/{owners}")
public List<Model> getos(@PathVariable int owners)
{
	return sser.getsn(owners);
}
@GetMapping("get2/{address}")
public List<Model> getuh(@PathVariable String address)
{
	return sser.getun(address);
}
@GetMapping("get3/{carName}")
public List<Model> getunn(@PathVariable String carName)
{
	return sser.getnn(carName);
}
@GetMapping("get4/{owners}/{cartype}")
public List<Model> gett(@PathVariable int owners,@PathVariable String cartype)
{
	return sser.getss(owners, cartype);
}
}
