package com.urtv.main.controller;

import com.urtv.main.entity.Movie;
import com.urtv.main.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
