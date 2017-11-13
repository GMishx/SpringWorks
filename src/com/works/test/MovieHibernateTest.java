package com.works.test;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.works.beans.Movies;

import org.hibernate.Session;

public class MovieHibernateTest {

	public static void main(String[] args) {

		// 1. load configuration file
		Configuration conf = new Configuration();
		conf.configure(new File("src\\moviehibernate.cfg.xml"));

		// 2. Obtain the data source
		SessionFactory factory = conf.buildSessionFactory();

		// 3. Obtain the connection
		Session session = factory.openSession();

		Movies bat=new Movies().setName("BatMan").setPrice(500);
		
		// 4. Start a transaction
		Transaction tx = session.beginTransaction();
		//tx.begin();

		// Fire the query
		session.save(bat);

		// Save the changes
		tx.commit();

		// Close the connection
		session.close();

	}

}
