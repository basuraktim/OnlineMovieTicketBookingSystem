package com.example.otbs.model;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8974887244743235859L;
	private String cityCode;
	private String cityName;
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public City(String cityCode, String cityName) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cityCode, cityName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityCode, other.cityCode) && Objects.equals(cityName, other.cityName);
	}
	
	
	
	

}
