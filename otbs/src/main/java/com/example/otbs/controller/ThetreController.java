package com.example.otbs.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.otbs.model.City;
import com.example.otbs.model.Movie;
import com.example.otbs.model.Theatre;
import com.example.otbs.service.TheatreService;

@RestController
public class ThetreController {
	
	Logger logger = LogManager.getLogger(ThetreController.class);
			
	@Autowired
	private TheatreService theatreService;
	
	@GetMapping("/v1/cities")
	public List<City> getListofCities() {
		logger.info("Getting City List");
		return theatreService.getCityList();
	}
	
	@GetMapping("/v1/theatres/{code}")
	public List<Theatre> getListofTheater(@PathVariable String code) {
		logger.info("Getting Theatre List");
		return theatreService.getTheatreList(code);
	}
	
	@PostMapping("/v1/theatre/{citycode}")
	public List<Theatre> addTheater(@RequestBody Theatre theatre, @PathVariable String citycode) {
		logger.info("Registering new theatre for citycode:" + citycode);
		return theatreService.addTheatre(theatre,citycode);
	}
	

}
