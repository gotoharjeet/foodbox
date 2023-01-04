package com.simplilearn.foodboxproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name="admin_tables")
public class Admin {
	
	public Admin() 
	{
		super();
	}
	
	
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="user_name",length=35)
	private String username;
	@Column(name="password", length=45)
	private String password;
	
	@Autowired
	public Admin(int id,String username,String password)
	{
		System.out.println("inside bean admin");
		this.id=id;
		this.username=username;
		this.password=password;
	}
	
	
	public int getId() {
		return id;
	}

	@Autowired
	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
	@Autowired
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	@Autowired
	public void setPassword(String password) {
		this.password = password;
	}

	
}

