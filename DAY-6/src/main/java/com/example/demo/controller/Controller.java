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
public class Controller {
@Autowired
Serv sser;
@PostMapping("post")
public List<Model> po(@RequestBody List<Model> ss)
{
	return sser.putinfo(ss);
}
@GetMapping("get")
public List<Model> ge()
{
	return sser.getinfo();
}
@GetMapping("g/{babyFirstName}")
public List<Model> gi(@PathVariable String babyFirstName)
{
	return sser.getsorted(babyFirstName);
}
@GetMapping("gu/{pgno}/{pgsize}")
public List<Model> gf(@PathVariable int pgno,@PathVariable int pgsize)
{
	return sser.page(pgno, pgsize);
}
}
