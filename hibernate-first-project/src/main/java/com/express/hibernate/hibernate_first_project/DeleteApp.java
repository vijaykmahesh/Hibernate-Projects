package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.express.entity.Song;
import com.express.utils.HibernateUtils;

public class DeleteApp {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.openSession();

		Song songDelete = session.get(Song.class, 1);

		session.beginTransaction();
		session.delete(songDelete);
		session.getTransaction().commit();

		System.out.println(songDelete);
	}

	

}
