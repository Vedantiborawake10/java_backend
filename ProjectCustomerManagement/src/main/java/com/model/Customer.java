package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
 private int id;
private String name;
private int ammount;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int id, String name, int ammount) {
	super();
	this.id = id;
	this.name = name;
	this.ammount = ammount;
}
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
public int getAmmount() {
	return ammount;
}
public void setAmmount(int ammount) {
	this.ammount = ammount;
}

}
