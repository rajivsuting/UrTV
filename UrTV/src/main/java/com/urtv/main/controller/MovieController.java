package com.urtv.main.controller;

import com.urtv.main.dto.AddMovieDto;
import com.urtv.main.entity.Movie;
import com.urtv.main.enums.Genre;
import com.urtv.main.service.MovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urtv/movie")
public class MovieController {
	
	
    private MovieService service;
    
    
    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }
    
    @GetMapping("/page/{pageNo}/{pageSize}")
    public ResponseEntity<Page<Movie>> getMoviesPaginated(@PathVariable int pageNo, @PathVariable int pageSize){
        Page<Movie> page=service.getMoviesPaginated(pageNo,pageSize);
        return new ResponseEntity<>(page, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Movie> addMovie(@PathVariable AddMovieDto movieDto){
    	
    	return new ResponseEntity<Movie>(service.addMovies(movieDto), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies(){
    	
    	return new ResponseEntity<List<Movie>>(service.getAllMovie(),HttpStatus.OK);
    }
    
    @GetMapping("/name/{movieName}")
    public ResponseEntity<List<Movie>> getMovieByName(@PathVariable("movieName") String movieName){
    	
    	return new ResponseEntity<List<Movie>>(service.getMovieByName(movieName),HttpStatus.OK);
    }
    
    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable("genre") Genre genre){
    	
    	return new ResponseEntity<List<Movie>>(service.getAllMoviesByGenre(genre),HttpStatus.OK);
    }
    
     
}
