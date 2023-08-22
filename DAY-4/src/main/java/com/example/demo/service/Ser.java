package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;

@Service
public class Ser {
	@Autowired
	Repository sr;
public Model saveinfo(Model ss)
{
	return sr.save(ss);
}
public List<Model> showinfo()
{
	return sr.findAll();
	}
public Model sand(Model ss)
{
	return sr.saveAndFlush(ss);
}
public void del(int id)
{
	sr.deleteById(id);
}
}
