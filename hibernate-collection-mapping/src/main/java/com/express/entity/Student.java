package com.express.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;

	private String student_name;

	private Long mobile_no;

	private int age;

//	@ElementCollection
//	@CollectionTable(name = "nicknames", joinColumns = @JoinColumn(name = "stud_id"))
//	private Set<String> nickNames = new HashSet<String>();

	@ElementCollection
	@MapKeyColumn(name = "nameType")
	@CollectionTable(name = "nicknames", joinColumns = @JoinColumn(name = "stud_id"))
	private Map<String, String> nickNames = new HashMap<String, String>();

	@ElementCollection
	@CollectionTable(name = "stud_address", joinColumns = @JoinColumn(name = "stud_id"))
	private List<Address> address  = new ArrayList<Address>();

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(Long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(Map<String, String> nickNames) {
		this.nickNames = nickNames;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

//	public Set<String> getNickNames() {
//		return nickNames;
//	}
//
//	public void setNickNames(Set<String> nickNames) {
//		this.nickNames = nickNames;
//	}

	
	
}
