 package com.example.otbs.model;

import java.io.Serializable;

public class Seat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6887948114827822734L;
	private int seatno;
	private char row;
	private char status;
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public char getRow() {
		return row;
	}
	public void setRow(char row) {
		this.row = row;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
	

}
