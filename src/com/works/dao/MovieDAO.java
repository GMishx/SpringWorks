package com.works.dao;

import java.util.List;

import com.works.beans.Movies;

public interface MovieDAO {

	void insertMovie(Movies movie);

	List<Movies> fetchAllMovies();
}
