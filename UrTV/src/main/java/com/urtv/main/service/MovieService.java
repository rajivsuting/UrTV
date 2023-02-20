package com.urtv.main.service;

import java.util.List;

import com.urtv.main.entity.Movie;
import com.urtv.main.enums.Genre;


public interface MovieService {
	
	public Movie addMovies(Movie movie);
	
	public List<Movie> getAllmovie();
	
	public List<Movie> getMovieByName(String name);
	
	public List<Movie> getAllMoviesByGenre(Genre genre);
}
