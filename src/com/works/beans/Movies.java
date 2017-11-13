package com.works.beans;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

public class Movies implements InitializingBean, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6129701376458350403L;
	private int id;
	private String name;
	private double price;

	public Movies() {
	}

	public Movies(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public Movies setId(int id) {
		this.id = id;
		return this;
	}

	public Movies setName(String name) {
		this.name = name;
		return this;
	}

	public Movies setPrice(double price) {
		this.price = price;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[id: " + id + ", name: " + name + ", price: " + price + "]");
		return sb.toString();
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("The object is ready for id: " + id);
	}
}
