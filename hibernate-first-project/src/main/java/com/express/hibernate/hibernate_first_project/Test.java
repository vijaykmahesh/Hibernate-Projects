package com.express.hibernate.hibernate_first_project;

import org.hibernate.SessionFactory;

import com.express.utils.HibernateUtils;

public class Test {

	public static void main(String[] args) {

		SessionFactory factory1 = HibernateUtils.getSessionFactory();

		SessionFactory factory2 = HibernateUtils.getSessionFactory();

		System.out.println(factory1 + " " + factory2);
	}

}
