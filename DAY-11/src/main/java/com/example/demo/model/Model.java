package com.example.demo.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Model {
@Id
@GeneratedValue
private int id;

private String name;
private String email;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="foreign_id")
private Model_2 add;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Model_2 getAdd() {
	return add;
}
public void setAdd(Model_2 add) {
	this.add = add;
}
public Model() {
	super();
	// TODO Auto-generated constructor stub
}
public Model(int id, String name, String email, Model_2 add) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.add = add;
}


}
