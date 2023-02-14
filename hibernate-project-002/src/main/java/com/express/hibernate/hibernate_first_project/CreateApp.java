package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Address;
import com.express.entity.Student;
import com.express.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		
		Session session = factory.openSession();
		
		Address homeAddress = new Address();
		homeAddress.setAddressLine1("krishnagar line1");
		homeAddress.setAddressLine2("jpnagar");
		
		Address hosteAddress = new Address();
		hosteAddress.setAddressLine1("kanakpura");
		hosteAddress.setAddressLine2("kanakpura road");
		
		Student student = new Student();
		student.setMobile(9066462166L);
		student.setName("vijay");
		student.setHomeAddress(homeAddress);
		student.setHostelAddress(hosteAddress);
		
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();

		
		
		
		
		

	}
}
