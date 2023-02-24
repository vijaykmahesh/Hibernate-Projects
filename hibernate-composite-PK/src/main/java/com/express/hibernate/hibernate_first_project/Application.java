package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.express.entity.Address;
import com.express.entity.Student;
import com.express.ids.StudentPrimaryKey;

public class Application {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		StudentPrimaryKey studentPrimaryKey = new StudentPrimaryKey("kantha", "UK");

		Student student = new Student(studentPrimaryKey);

		student.setMobile_no(9066462166L);
		student.setAge(25);
		
		Address address  = new Address();
		address.setAddressLine1("Stanford");
		address.setCity("UK");
		address.setStudent(student);
		
		session.save(student);
		session.save(address);

//		Student student = session.get(Student.class, new StudentPrimaryKey("vijay", "Ind"));
//
//		System.out.println(student.getMobile_no());

		session.getTransaction().commit();

		session.close();

	}
}
