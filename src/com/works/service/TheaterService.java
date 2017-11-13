package com.works.service;

import java.util.List;

import com.works.beans.Theater;

public interface TheaterService {

	void insertTheater(Theater theater);

	List<Theater> fetchAllTheaters();
}
