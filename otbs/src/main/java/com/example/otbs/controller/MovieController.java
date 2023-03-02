package com.example.otbs.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.otbs.customexception.MoviesNotFound;
import com.example.otbs.model.City;
import com.example.otbs.model.Movie;
import com.example.otbs.service.MovieService;

@RestController
public class MovieController {
	
	Logger logger = LogManager.getLogger(MovieController.class);
	
	@Autowired
	private MovieService movieService;
	
	//Get list of movies by theatre
	/*@GetMapping("/movies/{theatreId}")
	public List<Movie> getListofMoviesByTheatre(@PathVariable String theatreId) {
		return movieService.getMovieList(theatreId);
	}*/
	
	//Get list of movies by City
	@GetMapping("/v1/movies/{citicode}")
	public List<Movie> getListofMoviesByCity(@PathVariable String citicode) throws MoviesNotFound{
		ArrayList<Movie> movieList = null;
		try {
			movieList = (ArrayList<Movie>) movieService.getCurrentMoviesByCity(citicode);
		}catch(Exception ex) {
			throw new MoviesNotFound();
		}
		return movieList;
	}
	
	//Get list of movies by City
	@PostMapping("/v1/movies/{citicode}")
	public String addNewMovie(@RequestBody Movie movie, @PathVariable String citicode) {		
		City city = null;
		switch(citicode) {
		case "KO": city = new City("KO", "Kolkata");
		case "DL": city = new City("DL", "Delhi");
		}
		movieService.addMovie(movie, city);
		return "New Movie Added";
	}
	
	//Get list of all recent movies
	@GetMapping("/v1/movies")
	public List<Movie> getListofMovies() {
		logger.info("Getting Movie List");
		return movieService.getMovieList();
	}
		
	public void addMovie() {
		
	}
	
	public void deleteMovie() {
		
	}

}
