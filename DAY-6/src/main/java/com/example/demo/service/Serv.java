package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repo;

@Service
public class Serv {
	@Autowired
	Repo sr;
	public List<Model> putinfo(List<Model> ss)
	{
		return sr.saveAll(ss);
	}
	public List<Model> getinfo()
	{
		return sr.findAll();
	}
	public List<Model> getsorted(String babyFirstName)
	{
		return sr.findAll(Sort.by(Sort.Direction.ASC,babyFirstName));
	}
	public List<Model> page(int pgno,int pgsize)
	{
		return (sr.findAll(PageRequest.of(pgno, pgsize))).getContent()
;	}

}
