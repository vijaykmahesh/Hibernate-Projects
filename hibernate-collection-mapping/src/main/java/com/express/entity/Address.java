package com.express.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address { //value Type no PK
	
	private String addressLine1;
	
	private String city;

	
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
