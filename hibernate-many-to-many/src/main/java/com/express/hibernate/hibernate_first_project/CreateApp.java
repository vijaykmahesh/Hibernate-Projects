package com.express.hibernate.hibernate_first_project;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.express.entity.Actor;
import com.express.entity.Movie;

public class CreateApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Movie.class)
				.addAnnotatedClass(Actor.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		
		Movie movie  = new Movie("Color");
		
		List<Actor> actors  = new ArrayList<Actor>();
		
		Actor actor1 = new Actor("SRK");
		Actor actor2 = new Actor("kamal Hasan");
		
		actors.add(actor1);
		actors.add(actor2);
		
		movie.setActors(actors);
		
		session.save(movie);

		session.getTransaction().commit();
		
		session.close();

	}
}
