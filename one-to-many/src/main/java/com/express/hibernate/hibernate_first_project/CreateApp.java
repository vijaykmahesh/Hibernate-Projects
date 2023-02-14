package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Order;
import com.express.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = HibernateUtils.getSessionFactory();

		// Intialize session object
		Session session = factory.openSession();

		session.beginTransaction();

//		Customer customer = new Customer();
//		customer.setCustomerName("kumar");
//		customer.setMobileNo("9480267334");
//		
//		Order order = new Order();
//		order.setItem_name("Roller");
//		order.setCost(9000.00);
//		order.setCustomer(customer);
//		
//		
//		session.persist(order);

//		Order order = session.get(Order.class, 1);
//
//		session.delete(order);
		
		Order order = session.get(Order.class, 3);

		session.getTransaction().commit();

	}
}
