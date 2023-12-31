package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoginEntity;
import com.example.demo.model.repository.LoginRepo;

@Service
public class LoginService {
@Autowired
LoginRepo sr;
public LoginEntity saveinfo(LoginEntity ss)
{
	return sr.save(ss);
}
public List<LoginEntity> showinfo()
{
	return sr.findAll();
}
//public String update(String mailid,LoginEntity ss)
//{
//	sr.saveAndFlush(ss);
//	if(sr.existsById(mailid))
//	{
//		return "yes";
//	}
//	else
//	{
//		return "no";
//	}
//}
public String deleteinfo(String mailid)
{
	if(sr.existsById(mailid))
	{
		sr.deleteById(mailid);
		return "Your account Successfully deleted";
	}
	else
	{
		return "Please enter the valid username";
	}
}
}
