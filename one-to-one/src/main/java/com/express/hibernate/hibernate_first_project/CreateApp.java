package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = HibernateUtils.getSessionFactory();

		// Intialize session object
		Session session = factory.openSession();

//		Passport krishnaPassport = new Passport();
//		krishnaPassport.setPassportNumber("234678945");
//		
//		Student krishna  = new Student();
//		krishna.setCountry("US");
//		krishna.setName("krishna");
//		krishna.setPassport(krishnaPassport);

		session.beginTransaction();
		
		// session.save(krishna);

//		Student student = session.get(Student.class, 3);
//		session.delete(student);

		session.getTransaction().commit();

	}
}
