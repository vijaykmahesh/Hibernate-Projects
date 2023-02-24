package com.express.hibernate.hibernate_first_project;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Customer;
import com.express.entity.Order;
import com.express.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {

		// create Session Factory
		SessionFactory factory = HibernateUtils.getSessionFactory();

		// Intialize session object
		Session session = factory.openSession();

		session.beginTransaction();
		
		//Saving by using non owning entity
//		Customer cust = new Customer();
//		cust.setCustomerName("sri");
//		cust.setMobileNo("90887654312");
//		
//		List<Order> orders = new ArrayList<Order>();
//		
//		Order order1 = new Order();
//		order1.setCost(90876.00);
//		order1.setItem_name("violin");
//		
//		//Manual
//		order1.setCustomer(cust);
//		
//		Order order2 = new Order();
//		order2.setCost(50000.00);
//		order2.setItem_name("Band Set");
//		
//		//Manual
//		order2.setCustomer(cust);
//		
//		orders.add(order1);
//		orders.add(order2);
//		
//		cust.setOrders(orders);
//		
//		session.persist(cust);
		
		// Updating
		// we are trying to update customer with order
		
		Customer customer = session.get(Customer.class, 3);
		
		Order order = session.get(Order.class, 3);
		
		//order.setCustomer(customer);
		
		customer.addOrder(order);
		

		session.getTransaction().commit();

	}
}
