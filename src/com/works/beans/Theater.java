package com.works.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Theater implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8306899518083875022L;
	@Value(value = "500")
	private int id;
	private String name;
	private String location;

	@Autowired
	@Qualifier(value = "lor")
	private Movies movie;

	public Theater() {
	}

	public Theater(Movies movie2) {
		super();
		this.movie = movie2;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[id: " + id + ", name: " + name + ", location: " + location + ", movies: " + movie + "]");
		return sb.toString();
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public void initMethod() {
		System.out.println("init of theater for id: " + id);
	}
}
