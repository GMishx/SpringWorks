package com.works.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.works.beans.Movies;
import com.works.beans.Theater;

public class MovieBeanTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/*
		 * Movies movie = context.getBean("manOfSteel", Movies.class);*/
		/*Movies lor = context.getBean("lor", Movies.class);*/

		/*Movies lor = context.getBean("bat", Movies.class);*/
		//System.out.println(lor);

		Theater t = context.getBean("theater", Theater.class);
		/*
		 * System.out.println(movie); System.out.println(lor);
		 */
		System.out.println(t);

		((ConfigurableApplicationContext) context).close();

	}

}
