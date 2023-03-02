package com.example.otbs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Screen implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private List<Seat> seatList = new ArrayList<Seat>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Seat> getSeatList() {
		return seatList;
	}
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}	
}
