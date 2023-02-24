package com.express.hibernate.hibernate_first_project;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.express.entity.Address;
import com.express.entity.Student;

public class Application {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Student student = new Student();

		student.setStudent_name("vijay");
		student.setMobile_no(9066462166L);
		student.setAge(25);

		Map<String, String> nickNames = student.getNickNames();

		nickNames.put("nickname1", "Viji");
		nickNames.put("nickname2", "vijay krishne");

		Address address = new Address();

		address.setAddressLine1("jaynagar 4th block");
		address.setCity("Bangalore");

		Address address2 = new Address();

		address2.setAddressLine1("jpnagar");
		address2.setCity("Bangalore 560078");

		List<Address> addressList = student.getAddress();

		addressList.add(address);
		addressList.add(address2);

		student.setAddress(addressList);

		session.save(student);

		session.getTransaction().commit();

		session.close();

	}
}
