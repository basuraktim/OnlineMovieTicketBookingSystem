package com.example.otbs.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.example.otbs.model.City;
import com.example.otbs.model.Movie;

@Component
public class MovieRepository {
	Logger logger = LogManager.getLogger(MovieRepository.class);
		

	public List<Movie> getListOfMovie() {
		return DataSource.movieList;		
	}
	
	public void addMovie(Movie movie, City city) {

		DataSource.movieList.add(movie);

        List<Movie> movies = DataSource.moviesByCity.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        DataSource.moviesByCity.put(city, movies);
    }
	
	public List<Movie> getMovieListByCity(String cityCode){
		City city = null;
		switch(cityCode) {
		case "KO": city = new City("KO", "Kolkata");
		case "DL": city = new City("DL", "Delhi");
		}
		logger.info(cityCode, city);
		return DataSource.moviesByCity.get(city);
	}

}
