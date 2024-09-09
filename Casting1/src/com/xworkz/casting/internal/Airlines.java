package com.xworkz.casting.internal;

public class Airlines {

	String airLineName;
	
	
	public Airlines(String airLineName) {
		this.airLineName = airLineName;
		System.out.println("This is "+airLineName);
	}
	
	
	public void fly() {
		System.out.println("Start the engine");
	}
	
	
}
