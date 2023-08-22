package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK")
public class Model {
@Id
private int id;
private String bookname;
private float price;
private int quantity;
private String aname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public Model() {
	super();
	// TODO Auto-generated constructor stub
}
public Model(int id, String bookname, float price, int quantity, String aname) {
	super();
	this.id = id;
	this.bookname = bookname;
	this.price = price;
	this.quantity = quantity;
	this.aname = aname;
}


}
