package com.example.otbs.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.otbs.dao.TheatreRepository;
import com.example.otbs.model.City;
import com.example.otbs.model.Theatre;

@Service
public class TheatreService {
	Logger logger = LogManager.getLogger(TheatreService.class);
	
	@Autowired
	private TheatreRepository theatreRepo;
	
	public List<City> getCityList(){
		return theatreRepo.getListOfCities();
	}
	
	public List<Theatre> getTheatreList(String cityCode){
		return theatreRepo.getListOfTheatre(cityCode);
	}
	
	public List<Theatre> addTheatre(Theatre theatre, String cityCode){
		return theatreRepo.addTheatre(theatre,cityCode);
	}
	

}
