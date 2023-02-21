package com.urtv.main.service;

import java.util.List;

import com.urtv.main.dto.AddMovieDto;
import com.urtv.main.entity.Movie;
import com.urtv.main.enums.Genre;
import org.springframework.data.domain.Page;


public interface MovieService {
	
	public Movie addMovies(AddMovieDto dto);
	
	public List<Movie> getAllMovie();
	
	public List<Movie> getMovieByName(String name);
	
	public List<Movie> getAllMoviesByGenre(Genre genre);

	public Page<Movie> getMoviesPaginated(int pageNo, int pageSize);
}
