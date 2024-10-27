package com.xworkz.newsignuppage.dto;

import java.io.Serializable;

public class SignUpDTO implements Serializable{
	
	String username;
	String phnoNumber;
	
	public SignUpDTO() {
		
	}
	
	
	public SignUpDTO(String username, String phnoNumber2) {
		super();
		this.username = username;
		this.phnoNumber = phnoNumber2;
	}
	@Override
	public String toString() {
		return "SignUpDTO [name=" + username + ", phnoNumber=" + phnoNumber + "]";
	}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getPhnoNumber() {
		return phnoNumber;
	}
	public void setPhnoNumber(String phnoNumber) {
		this.phnoNumber = phnoNumber;
	}
	
}
