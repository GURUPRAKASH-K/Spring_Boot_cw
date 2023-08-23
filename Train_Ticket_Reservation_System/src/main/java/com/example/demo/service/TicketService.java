package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TicketEntity;
import com.example.demo.model.repository.TicketRepository;

@Service
public class TicketService {
@Autowired
TicketRepository sr;
public List<TicketEntity> saveinfo(List<TicketEntity> ss)
{
	return sr.saveAll(ss);
}
public List<TicketEntity> showinfo()
{
	return sr.findAll();
}
public Optional<TicketEntity> getbyid(Long phone_no)
{
	return sr.findById(phone_no);
}
public TicketEntity updateinfo(TicketEntity ss)
{
	return sr.saveAndFlush(ss);
}
public String updatebyid(Long phone_no,TicketEntity ss)
{
	sr.saveAndFlush(ss);
	 if(sr.existsById(phone_no))
	 {
		 return "valid number";
	 }
	 else
	 {
		 return "please enter the valid number";
	 }
}
public String deleteat(Long phone_no)
{
	if(sr.existsById(phone_no))
	{
		sr.deleteById(phone_no);
		return "valid number";
		
	}
	else
	{
		return "Invalid number";
	}
}
}
