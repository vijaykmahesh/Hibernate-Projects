package com.express.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.express.entity.Customer;
import com.express.entity.Order;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		try {
			if (sessionFactory == null) {
				Configuration configuration = new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(Customer.class);
				configuration.addAnnotatedClass(Order.class);

				sessionFactory = configuration.buildSessionFactory();

			}
		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("Session Factory not created");
		}

		return sessionFactory;

	}

}
