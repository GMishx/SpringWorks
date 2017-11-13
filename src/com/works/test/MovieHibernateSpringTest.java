package com.works.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.works.beans.Movies;
import com.works.service.MovieService;

public class MovieHibernateSpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("moviehibernatebeans.xml");

		MovieService service = context.getBean("movieService", MovieService.class);

		//service.insertMovie(new Movies().setName("TBBT").setPrice(350));
		
		System.out.println(service.fetchAllMovies());

		((ConfigurableApplicationContext) context).close();

	}

}
