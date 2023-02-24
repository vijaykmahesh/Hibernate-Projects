package com.express.ids;

import java.io.Serializable;

public class StudentId implements Serializable {

	private String student_name;

	private String country;

	public StudentId() {
	}

	public StudentId(String student_name, String country) {
		this.student_name = student_name;
		this.country = country;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
