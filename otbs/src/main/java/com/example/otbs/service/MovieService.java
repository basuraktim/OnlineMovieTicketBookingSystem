package com.example.otbs.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.otbs.dao.MovieRepository;
import com.example.otbs.model.City;
import com.example.otbs.model.Movie;

@Service
public class MovieService {
	Logger logger = LogManager.getLogger(MovieService.class);
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getMovieList(){
		return movieRepository.getListOfMovie();
	}
	
	public void addMovie(Movie movie, City city) {
		movieRepository.addMovie(movie, city);
    }
	
	public List<Movie> getCurrentMoviesByCity(String citycode) {
		logger.info("In movie service: "+citycode);
		return movieRepository.getMovieListByCity(citycode);
    }


}
