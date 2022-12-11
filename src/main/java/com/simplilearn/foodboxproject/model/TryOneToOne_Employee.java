package com.simplilearn.foodboxproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="employee_details")
public class TryOneToOne_Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_Id")
	private int empid;
	private String name;
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_add_id")
	private TryOneToOne_Address address;
	
	
	public TryOneToOne_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public TryOneToOne_Address getAddress() {
		return address;
	}

	public void setAddress(TryOneToOne_Address address) {
		this.address = address;
	}

	
	
	
}
