package com.works.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.works.beans.Theater;

@Repository("theaterDAO")
public class TheaterDAOImpl implements TheaterDAO {

	public void insertTheater(Theater theater) {
		System.out.println("Inserting theater: " + theater);
	}

	public List<Theater> fetchAllTheaters() {
		System.out.println("Fetching all theaters");
		return null;
	}

}
