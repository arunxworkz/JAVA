package com.xworkz.Airlines.lift;

public class Instance {

	Airline airline;
	
	public void instance() {
		
		if(airline != null) {
			airline.method();
		}
		else {
			System.out.println("Check th enull pointer");
		}
	}
	
	
	
}
