package com.example.otbs.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.example.otbs.model.City;
import com.example.otbs.model.Movie;
import com.example.otbs.model.Theatre;
import com.example.otbs.service.TheatreService;

@Component
public class TheatreRepository {
	
	Logger logger = LogManager.getLogger(TheatreRepository.class);
	
	private List<City> cityList = Arrays.asList(new City("KO","Kolkata"),
												new City("DL","Delhi"),
												new City("BL","Bangalore"),
												new City("CN","Chennai"),
												new City("MB","Mumbai"),
												new City("HB","Hydrabad"));
	
	
	private List<Theatre> theatreKO = new ArrayList<>(Arrays.asList(new Theatre("KO1","XYZ","Kolkata 1","9999888700","LIC123456"),
			new Theatre("KO2","XYZ1","Kolkata 2","9999888777","LIC456789"),
			new Theatre("KO3","XYZ2","Kolkata 3","9999888789","LIC789000")
			));
	
	private List<Theatre> theatreDL = new ArrayList<>(Arrays.asList(new Theatre("DL1","XYZDL","Delhi 1","9999888700","LIC123456"),
			new Theatre("DL2","XYZDL 1","Delhi 2","9999888700","LIC123456")));
	
	private List<Theatre> theatreBL = new ArrayList<>(Arrays.asList(new Theatre("BL1","XYZ","Bangalore 1","9999888700","LIC123456"),
			new Theatre("BL2","XYZBL","Bangalore 2","9999888700","LIC123456")));
	
	private List<Theatre> theatreCN = new ArrayList<>(Arrays.asList(new Theatre("CN1","XYZ","Chennai 1","9999888700","LIC123456"),
			new Theatre("CN2","XYZCN","Chennai 2","9999888700","LIC123456")));
	
	private List<Theatre> theatreMB = new ArrayList<>(Arrays.asList(new Theatre("MB1","XYZ","Mumbai 1","9999888700","LIC123456"),
			new Theatre("MB2","XYZMB","Mumbai 2","9999888700","LIC123456")));
	
	private List<Theatre> theatreHB = new ArrayList<>(Arrays.asList(new Theatre("HB1","XYZ","Hydrabad 1","9999888700","LIC123456"),
			new Theatre("HB2","XYZHB","Hydrabad 2","9999888700","LIC123456")));
	
	private Map<String, List<Theatre>> theatreMap= new ConcurrentHashMap<String, List<Theatre>>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		put("KO",theatreKO);
		put("DL",theatreDL);
		put("BL",theatreBL);
		put("CN",theatreCN);
		put("MB",theatreMB);
		put("HB",theatreHB);
	}};
	
	private Map<String, List<Theatre>> movieMap= new ConcurrentHashMap<String, List<Theatre>>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		put("KO",theatreKO);
		put("DL",theatreDL);
		put("BL",theatreBL);
		put("CN",theatreCN);
		put("MB",theatreMB);
		put("HB",theatreHB);
	}};
	
	// Get List of Cities
	public List<City> getListOfCities() {		
		return cityList;
	}
	
	// Get List of Theatres 
	public List<Theatre> getListOfTheatre(String cityCode) {
		return theatreMap.get(cityCode);		
	}
	
	// Register New Theatre
	public List<Theatre> addTheatre(Theatre theatre, String cityCode) {
		List<Theatre> list = theatreMap.get(cityCode);
		list.add(theatre);
		theatreMap.put(cityCode, list);
		return theatreMap.get(cityCode);		
	}
	
	

}
