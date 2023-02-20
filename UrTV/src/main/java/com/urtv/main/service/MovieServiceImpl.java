package com.urtv.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urtv.main.entity.Movie;
import com.urtv.main.enums.Genre;
import com.urtv.main.exception.MovieException;
import com.urtv.main.repository.MovieRepo;


@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepo movieRepo;
	

	@Override
	public Movie addMovies(Movie movie) {

		return null;
	}
	

	@Override
	public List<Movie> getAllmovie() {
		
		List<Movie> movieList = movieRepo.findAll();
		
		if(movieList.isEmpty()) throw new MovieException("No movie found.");

		return movieList;
	}
	

	@Override
	public List<Movie> getMovieByName(String name) {
		
		List<Movie> movieList = movieRepo.findAllByName(name);
		
		if(movieList.isEmpty()) throw new MovieException("No movie found with name "+name);

		return movieList;
	}
	

	@Override
	public List<Movie> getAllMoviesByGenre(Genre genre) {

		List<Movie> movieList = movieRepo.findAllByGenre(genre);
		
		if(movieList.isEmpty()) throw new MovieException("No movie found with genre "+genre);

		return movieList;
	}

}
