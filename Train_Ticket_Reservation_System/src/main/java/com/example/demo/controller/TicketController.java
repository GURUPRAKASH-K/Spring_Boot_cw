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

import com.example.demo.model.TicketEntity;
import com.example.demo.service.TicketService;

@RestController
public class TicketController {
@Autowired
TicketService sser;
@PostMapping("post")
public List<TicketEntity> disp(@RequestBody List<TicketEntity> ss)
{
	return sser.saveinfo(ss);
}

@GetMapping("get")
public List<TicketEntity> dis()
{
	return sser.showinfo();
}
@GetMapping("get/{phone_no}")
public Optional<TicketEntity> getid(@PathVariable Long phone_no)
{
	return sser.getbyid(phone_no);
}
@PutMapping("put")
public TicketEntity update(@RequestBody TicketEntity ss)
{
	return sser.updateinfo(ss);
}
@PutMapping("put/{phone_no}")
public String updateby(@PathVariable Long phone_no,@RequestBody TicketEntity ss)
{
	return sser.updatebyid(phone_no,ss);
}
@DeleteMapping("delete/{phone_no}")
public String delete(@PathVariable Long phone_no)
{
	return sser.deleteat(phone_no);
}
}
