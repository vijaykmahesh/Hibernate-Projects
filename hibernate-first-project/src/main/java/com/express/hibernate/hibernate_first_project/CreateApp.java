package com.express.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.express.entity.Song;

public class CreateApp {
	public static void main(String[] args) {

		// Create Configuration
		// Helps us to bootstrap the application
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		// create Session Factory
		SessionFactory factory = configuration.buildSessionFactory();

		// Intialize session object
		Session session = factory.openSession();

		Song song1 = new Song();

		//song1.setId(2);
		song1.setSongName("SDSDFSFDSFD");
		song1.setArtist("SWEWREWE");

		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();

		System.out.println("song saved check db");

		session.close();

	}
}
