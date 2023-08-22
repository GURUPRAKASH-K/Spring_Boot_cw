package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repo;

@Service
public class Serv {
@Autowired
Repo sr;
	public List<Model> saveinfo(List<Model> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<Model> showinfo()
	{
		return sr.findAll();
		}
	public Optional<Model> getbyid(int id)
	{
		return sr.findById(id);
	}
	public Model update(Model ss)
	{
		return sr.saveAndFlush(ss);
	}
	public String upbyid(int id,Model ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "True";
		}
		else
		{
			return "false";
		}
	}
	public String delteid(int id)
	{
		
		if(sr.existsById(id))
		{
			sr.deleteById(id);
			return "true";
			
		}
		else
		{
			return "false";
		}
	}
	
}
