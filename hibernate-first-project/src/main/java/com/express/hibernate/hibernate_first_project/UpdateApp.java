package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.express.entity.Song;
import com.express.utils.HibernateUtils;

public class UpdateApp {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.openSession();
		
		session.beginTransaction();

		Song songUpdated = session.get(Song.class, 1);
		
		songUpdated.setSongName("Kannu updated");
	
		session.update(songUpdated);
		
		session.getTransaction().commit();

		System.out.println(songUpdated);
	}

}
