package com.works.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.works.beans.Theater;
import com.works.service.TheaterService;

public class TheaterServiceTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("servicebean.xml");

		TheaterService service = context.getBean("theaterService", TheaterService.class);

		Theater meen = context.getBean("meen", Theater.class);

		service.insertTheater(meen);

		((ConfigurableApplicationContext) context).close();

	}

}
