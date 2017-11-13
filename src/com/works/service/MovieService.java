package com.works.service;

import java.util.List;

import com.works.beans.Movies;

public interface MovieService {

	void insertMovie(Movies movie);

	List<Movies> fetchAllMovies();
}
