package com.urtv.main.service;

import java.util.List;

import com.urtv.main.dto.AddMovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.urtv.main.entity.Movie;
import com.urtv.main.enums.Genre;
import com.urtv.main.exception.MovieException;
import com.urtv.main.repository.MovieRepo;


@Service
public class MovieServiceImpl implements MovieService {

	private MovieRepo movieRepo;
	@Autowired
	public MovieServiceImpl(MovieRepo movieRepo) {
		this.movieRepo = movieRepo;
	}

	@Override
	public Movie addMovies(AddMovieDto dto) {
		Movie movie=new Movie();
		movie.setMovieName(dto.getMovieName());
		movie.setMovieUrl(dto.getMovieUrl());
		movie.setBannerUrl(dto.getBannerUrl());
		movie.setCasts(dto.getCasts());
		movie.setCountry(dto.getCountry());
		movie.setRating(dto.getRating());
		movie.setDescription(dto.getDescription());
		movie.setReleaseDate(dto.getReleaseDate());
		movie.setGenre(dto.getGenre());
		movie.setDuration(dto.getDuration());

		return movieRepo.save(movie);
	}
	

	@Override
	public List<Movie> getAllMovie() {
		
		List<Movie> movieList = movieRepo.findAll();
		
		if(movieList.isEmpty()) throw new MovieException("No movie found.");

		return movieList;
	}
	

	@Override
	public List<Movie> getMovieByName(String name) {
		
		List<Movie> movieList = movieRepo.findAllByMovieName(name);
		
		if(movieList.isEmpty()) throw new MovieException("No movie found with name "+name);

		return movieList;
	}
	

	@Override
	public List<Movie> getAllMoviesByGenre(Genre genre) {

		List<Movie> movieList = movieRepo.findAllByGenre(genre);
		
		if(movieList.isEmpty()) throw new MovieException("No movie found with genre "+genre);

		return movieList;
	}

	@Override
	public Page<Movie> getMoviesPaginated(int pageNo, int pageSize) {
		Pageable pageable= PageRequest.of(pageNo-1,pageSize);
		return movieRepo.findAll(pageable);
	}

}
