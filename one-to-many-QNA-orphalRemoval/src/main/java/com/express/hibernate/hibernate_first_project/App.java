package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Order;
import com.express.utils.HibernateUtils;

public class App {
	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = HibernateUtils.getSessionFactory();

		// Intialize session object
		Session session = factory.openSession();

		session.beginTransaction();

		// Delete an order and its associated customer
		Order order = session.get(Order.class, 10);

		session.delete(order);

		session.getTransaction().commit();

	}
}
