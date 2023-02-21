package com.urtv.main.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urtv.main.entity.Movie;
import com.urtv.main.enums.Genre;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
	
	public List<Movie> findAllByMovieName(String name);

	public List<Movie> findAllByGenre(Genre genre);
	

}
