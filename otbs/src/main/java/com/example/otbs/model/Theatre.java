package com.example.otbs.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Theatre implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8919019981679504803L;
	private String id;
	private String name;
	private String address;
	private String contact;
	private String licenseNo;
	private List<Movie> movieList = new LinkedList<Movie>();;
	private List<Show> showList = new LinkedList<Show>();
	private List<Screen> screenList = new LinkedList<Screen>();;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	public List<Movie> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	public List<Show> getShowList() {
		return showList;
	}
	public void setShowList(List<Show> showList) {
		this.showList = showList;
	}
	public List<Screen> getScreenList() {
		return screenList;
	}
	public void setScreenList(List<Screen> screenList) {
		this.screenList = screenList;
	}
	public Theatre(String id, String name, String address, String contact, String licenseNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.licenseNo = licenseNo;
		
	}
	
	

}
