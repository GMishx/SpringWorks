package com.works.factory;

import com.works.beans.Movies;

public class MovieFactory {
	
	public Movies getMovie() {
		return new Movies().setId(3).setName("Batman").setPrice(255);
	}

}
