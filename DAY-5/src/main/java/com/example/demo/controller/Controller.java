package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.Serv;

@RestController
public class Controller {
	@Autowired
	Serv sser;
  @PostMapping("pot")
  public List<Model> add(@RequestBody List<Model> ss)
	{
		return sser.saveinfo(ss);
	}
@GetMapping("get")
public List<Model> impo()
{
	return sser.showinfo();
}
@GetMapping("get/{id}")
public Optional<Model> getid(@PathVariable int id)
{
	return sser.getbyid(id);
}
@PutMapping("put")
public Model into(@RequestBody Model ss)
{
	return sser.update(ss);
}
@PutMapping("put/{id}")
public String in(@PathVariable int  id, @RequestBody Model ss)
{
	return sser.upbyid(id, ss);
}
@DeleteMapping("delete/{id}")
public String delet(@PathVariable int id)
{
	return sser.delteid(id);
}
}


