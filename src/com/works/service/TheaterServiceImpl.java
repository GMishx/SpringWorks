package com.works.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import com.works.beans.Theater;
import com.works.dao.TheaterDAO;

@Service("theaterService")
public class TheaterServiceImpl implements TheaterService {

	private TheaterDAO theaterDAO;

	public TheaterDAO getTheaterDAO() {
		return theaterDAO;
	}

	@Autowired
	@Required
	public void setTheaterDAO(TheaterDAO theaterDAO) {
		this.theaterDAO = theaterDAO;
	}

	public void insertTheater(Theater theater) {
		theaterDAO.insertTheater(theater);
	}

	public List<Theater> fetchAllTheaters() {
		return theaterDAO.fetchAllTheaters();
	}

}
