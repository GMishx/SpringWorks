package com.works.service;

import java.util.List;

import javax.transaction.Transactional;

import com.works.beans.Movies;
import com.works.dao.MovieDAO;

//@Service("movieService")
@Transactional
public class MovieServiceImpl implements MovieService {

	private MovieDAO movieDAO;

	public MovieDAO getMovieDAO() {
		return movieDAO;
	}

	//@Autowired
	//@Required
	public void setMovieDAO(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}

	@Transactional
	public void insertMovie(Movies movie) {
		movieDAO.insertMovie(movie);
	}

	public List<Movies> fetchAllMovies() {
		return movieDAO.fetchAllMovies();
	}

}
