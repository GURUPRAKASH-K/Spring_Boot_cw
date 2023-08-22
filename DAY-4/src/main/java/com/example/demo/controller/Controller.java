package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.service.Ser;

@RestController
public class Controller {
	@Autowired
Ser sser;
@PostMapping("post")
public Model show(@RequestBody Model ss)
{
	return sser.saveinfo(ss);
}
@GetMapping("dis")
public List<Model> stoe()
{
	return sser.showinfo();
}
@PutMapping("put")
public Model inf(@RequestBody Model ss)
{
	return sser.sand(ss);
}
@DeleteMapping("del")
public String del(@RequestParam int id)
{
	sser.del(id);
	return "successfully deleted";
}
}
