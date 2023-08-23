package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ticket_Details")
public class TicketEntity {
private String name;
@Id
private Long phone_no;
private int age;
private String source;
private String destination;
private String date;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getPhone_no() {
	return phone_no;
}
public void setPhone_no(Long phone_no) {
	this.phone_no = phone_no;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public TicketEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public TicketEntity(String name, Long phone_no, int age, String source, String destination, String date) {
	super();
	this.name = name;
	this.phone_no = phone_no;
	this.age = age;
	this.source = source;
	this.destination = destination;
	this.date = date;
}

}
