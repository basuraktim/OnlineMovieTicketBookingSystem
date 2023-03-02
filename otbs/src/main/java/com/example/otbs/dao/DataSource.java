package com.example.otbs.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.example.otbs.model.City;
import com.example.otbs.model.Movie;

@Component
public class DataSource {
	
	static Map<City, List<Movie>> moviesByCity= new ConcurrentHashMap<City, List<Movie>>();
	static List<Movie> movieList = new ArrayList<Movie>();
	static List<City> cityList = new ArrayList<City>();
	
	static {
		cityList.add(new City("KO", "Kolkata"));
		cityList.add(new City("DL", "Delhi"));
		//Movie1
        Movie topgun = new Movie();
        topgun.setCode("1");
        topgun.setName("TopGun");
        topgun.setGenre("Action");
        topgun.setLanguage("English");
        topgun.setCityList(cityList);

        //Movie2
        Movie avatar = new Movie();
        avatar.setCode("2");
        avatar.setName("Avatar");
        avatar.setGenre("SiFi");
        avatar.setLanguage("English");
        avatar.setCityList(cityList);
        
        movieList.add(topgun);
        movieList.add(avatar);
        
        moviesByCity.put(new City("KO", "Kolkata"), movieList);
        moviesByCity.put(new City("DL", "Delhi"), movieList);
	}


}
