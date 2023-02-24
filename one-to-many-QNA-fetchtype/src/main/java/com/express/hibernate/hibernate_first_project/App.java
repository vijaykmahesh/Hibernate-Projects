package com.express.hibernate.hibernate_first_project;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Customer;
import com.express.entity.Order;
import com.express.utils.HibernateUtils;

public class App {
	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = HibernateUtils.getSessionFactory();

		// Intialize session object
		Session session = factory.openSession();

		session.beginTransaction();

//		Customer customer = session.get(Customer.class, 3);
//
//		System.out.println("customer 1 mobile is "+customer.getMobileNo());
//		
//		List<Order> orders = customer.getOrders();
//		
//		orders.forEach(order -> System.out.println(order.getItem_name() + "-----" +order.getCost()));

		Order order = session.get(Order.class, 3);
		
		System.out.println("Order 1  is "+order);
	}
}
