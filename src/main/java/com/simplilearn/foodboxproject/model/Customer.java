package com.simplilearn.foodboxproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name="email", length=45)
	private String email;
	@Column(name="password", length=45)
	private String password;
	@Column(name="name", length=45)
	private String name;
	@Column(name="contact", length=45)
	private String contact;
	@Column(name="address", length=45)
	private String address;
	
	public Customer(String email, String password, String name, String contact, String address) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public Customer() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}