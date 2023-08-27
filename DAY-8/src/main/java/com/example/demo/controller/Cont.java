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
@PostMapping("post")
public List<Model> postin(@RequestBody List<Model> ss)
{
	return sser.postinfo(ss);
}
@GetMapping("get")
public List<Model> getin()
{
	return sser.getinfo();
	}
@GetMapping("get1/{name}")
public List<Model> star(@PathVariable String name)
{
	return sser.startswi(name);
}
@GetMapping("get2/{name}")
public List<Model> en(@PathVariable String name)
{
	return sser.endswi(name);
}

}
