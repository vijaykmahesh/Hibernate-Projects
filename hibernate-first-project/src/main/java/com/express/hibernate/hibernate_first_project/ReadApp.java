package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Song;
import com.express.utils.HibernateUtils;

public class ReadApp {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.openSession();

		// Song song = session.get(Song.class, 2);
		session.beginTransaction();
		Song song = session.load(Song.class, 1);
		session.getTransaction().commit();

		System.out.println(song);

	}
}
