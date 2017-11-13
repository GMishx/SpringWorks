package com.works.dao;

import java.util.List;

import com.works.beans.Theater;

public interface TheaterDAO {

	void insertTheater(Theater theater);

	List<Theater> fetchAllTheaters();
}
