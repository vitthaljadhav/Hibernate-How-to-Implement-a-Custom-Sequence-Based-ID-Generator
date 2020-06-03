package com.example.demo.model.id;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class AddressId implements Serializable{

	private String id;
	private String addressId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
}
