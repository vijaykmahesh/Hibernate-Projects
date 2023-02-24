package com.express.ids;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentPrimaryKey implements Serializable {

	private String student_name;

	private String country;

	public StudentPrimaryKey() {
		
	}

	public StudentPrimaryKey(String student_name, String country) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((student_name == null) ? 0 : student_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPrimaryKey other = (StudentPrimaryKey) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (student_name == null) {
			if (other.student_name != null)
				return false;
		} else if (!student_name.equals(other.student_name))
			return false;
		return true;
	}
	
	
	
	

}
