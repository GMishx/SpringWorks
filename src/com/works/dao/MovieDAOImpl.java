package com.works.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.works.beans.Movies;

//@Repository("movieDAO")
public class MovieDAOImpl extends HibernateDaoSupport implements MovieDAO {

	@Autowired
	public void anyMethod(SessionFactory factory) {
		this.setSessionFactory(factory);
	}
	
	public void insertMovie(Movies movie) {
		System.out.println("Inserting movie: " + movie);
		this.getHibernateTemplate().save(movie);
	}

	public List<Movies> fetchAllMovies() {
		System.out.println("Fetching all movies");
		return (List<Movies>) this.getHibernateTemplate().find("From Movies");
	}

}
