package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.express.entity.Address;
import com.express.entity.Student;

public class Application {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
		Student student = session.get(Student.class, 1);
		System.out.println("printing student object");
		System.out.println(student);
		
		
		transaction.commit();
		
		session.close();

	}
}
