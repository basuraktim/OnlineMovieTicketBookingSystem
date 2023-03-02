package com.example.otbs.model;

import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;
	private String genre;
	private String language;
	private List<City> cityList;

	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	public Movie(String code, String name, String genre, String language, List<City> cityList) {
		super();
		this.code = code;
		this.name = name;
		this.genre = genre;
		this.language = language;
		this.cityList = cityList;
	}
	
	public Movie() {
		
	}
	
	
	
}
