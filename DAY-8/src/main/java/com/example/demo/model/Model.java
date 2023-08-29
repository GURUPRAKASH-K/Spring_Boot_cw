package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="start")
public class Model {
	@Id
	@GeneratedValue
private int bikeid;
private String ownername;
private int year;
private String bikename;
private String modelname;
public int getBikeid() {
	return bikeid;
}
public void setBikeid(int bikeid) {
	this.bikeid = bikeid;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename;
}
public String getModelname() {
	return modelname;
}
public void setModelname(String modelname) {
	this.modelname = modelname;
}
public Model(int bikeid, String ownername, int year, String bikename, String modelname) {
	super();
	this.bikeid = bikeid;
	this.ownername = ownername;
	this.year = year;
	this.bikename = bikename;
	this.modelname = modelname;
}
public Model() {
	super();
	// TODO Auto-generated constructor stub
}


}
