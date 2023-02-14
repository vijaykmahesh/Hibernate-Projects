package com.express.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Long mobile;
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="addressLine1",
                           column=@Column(name="home_address_line_1")),
        @AttributeOverride(name="addressLine2",
                           column=@Column(name="home_address_line_2"))
    })

	private Address homeAddress; // composite value type
	
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="addressLine1",
                           column=@Column(name="hostel_address_line_1")),
        @AttributeOverride(name="addressLine2",
                           column=@Column(name="hostel_address_line_2"))
    })

	private Address hostelAddress; // composite value type
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(Address hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	
	
	

}
