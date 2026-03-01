package com.platzi.play.web.controller;
import com.platzi.play.persistence.crud.CrudMovieEntity;
import com.platzi.play.persistence.entity.MovieEntity;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	private final CrudMovieEntity crduMovieEntity;
	
	public MovieController(CrudMovieEntity crudMovieEntity) {
		this.crduMovieEntity = crudMovieEntity;
	}
	
	@GetMapping("/platzi-play/api/movies")	
	public List<MovieEntity> getAllMovies() {		
		return (List<MovieEntity>) this.crduMovieEntity.findAll();
	}
}






























