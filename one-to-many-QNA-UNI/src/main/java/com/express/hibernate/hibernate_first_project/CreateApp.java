package com.express.hibernate.hibernate_first_project;

import java.util.List;

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

		/*
		 * Find all orders associated with a customer
		 */
		List<Order> listOrders = session.createQuery("Select o from Order o where o.customer.customer_id =:customerId",Order.class)
				.setParameter("customerId", 7)
				.list();
		
		
		listOrders.forEach(order -> System.out.println(order));
		session.getTransaction().commit();

	}
}
