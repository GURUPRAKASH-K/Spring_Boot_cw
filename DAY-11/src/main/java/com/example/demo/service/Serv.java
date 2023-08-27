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
public List<Model> getinfo()
{
	return sr.findAll();
}
public List<Model> postinfo(List<Model> ss)
{
	return sr.saveAll(ss);
}
}
