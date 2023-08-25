package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repo;

@Service
public class Serv {
	@Autowired
	Repo sr;
	public List<Model> showinfo(List<Model> ss)
	{
		return sr.saveAll(ss);
	}
	public List<Model> getinfo()
	{
		return sr.findAll();
	}
	public List<Model> getsn(int owners)
	{
		return sr.geto(owners);
	}
	public List<Model> getun(String address)
	{
		return sr.geti(address);
	}
	public List<Model> getnn(String carName)
	{
		return sr.geta(carName);
	}
	
	public List<Model> getss(int owners,String cartype)
	{
		return sr.gete(owners, cartype);
	}

}
