package com.express.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Addresses")
public class Address { // value Type no PK

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;

	private String addressLine1;

	private String city;

	@ManyToOne
	@JoinColumn(name = "name_fk",referencedColumnName = "student_name")
	@JoinColumn(name = "country_fk",referencedColumnName = "country")
	private Student student;

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

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
