package com.simplilearn.foodboxproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="address_details")
public class TryOneToOne_Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_Id")
	private long addressId;
	private String city;
	private String addressType;
	
	
	
	public TryOneToOne_Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
}
