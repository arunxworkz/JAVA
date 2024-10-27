package com.xworkz.newsignuppage.dto;

import java.io.Serializable;

public class SignUpDTO implements Serializable{
	
	String name;
	String phnoNumber;
	
	public SignUpDTO() {
		
	}
	
	
	public SignUpDTO(String name, String phnoNumber2) {
		super();
		this.name = name;
		this.phnoNumber = phnoNumber2;
	}
	@Override
	public String toString() {
		return "SignUpDTO [name=" + name + ", phnoNumber=" + phnoNumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnoNumber() {
		return phnoNumber;
	}
	public void setPhnoNumber(String phnoNumber) {
		this.phnoNumber = phnoNumber;
	}
	
}
