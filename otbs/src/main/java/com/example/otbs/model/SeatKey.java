package com.example.otbs.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class SeatKey {
	private String theatreCode;
	private String movieId;
	private String showTime; 
	private LocalDate date;
	public SeatKey(String theatreCode, String movieId, String showTime, LocalDate date) {
		super();
		this.theatreCode = theatreCode;
		this.movieId = movieId;
		this.showTime = showTime;
		this.date = date;
	}
	public String getTheatreCode() {
		return theatreCode;
	}
	public void setTheatreCode(String theatreCode) {
		this.theatreCode = theatreCode;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, movieId, showTime, theatreCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeatKey other = (SeatKey) obj;
		return Objects.equals(date, other.date) && Objects.equals(movieId, other.movieId)
				&& Objects.equals(showTime, other.showTime) && Objects.equals(theatreCode, other.theatreCode);
	}
	
	

}
