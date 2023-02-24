package com.express.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.express.ids.StudentPrimaryKey;

@Entity
@Table(name = "Student")
//@IdClass(StudentId.class)
public class Student {

	@EmbeddedId
	private StudentPrimaryKey studentPrimaryKey;

//	@Id
//	private String student_name;

	private Long mobile_no;

	private int age;

//	@Id
//	private String country;

//	public String getStudent_name() {
//		return student_name;
//	}
//
//	public void setStudent_name(String student_name) {
//		this.student_name = student_name;
//	}

	public Long getMobile_no() {
		return mobile_no;
	}

	public Student() {

	}

	public Student(StudentPrimaryKey studentPrimaryKey) {

		this.studentPrimaryKey = studentPrimaryKey;
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

//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}

}
