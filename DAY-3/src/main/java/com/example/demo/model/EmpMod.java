package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class EmpMod {
	@Id
private int id;
private String empname;
private int age;
private long salary;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public EmpMod() {
	super();
	// TODO Auto-generated constructor stub
}
public EmpMod(int id, String empname, int age, long salary) {
	super();
	this.id = id;
	this.empname = empname;
	this.age = age;
	this.salary = salary;
}

}
