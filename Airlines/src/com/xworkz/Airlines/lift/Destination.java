package com.xworkz.Airlines.lift;

public class Destination {

	public void parameter(Airline airline) {
		
		//airline.type = "Boing"; - This can not be done
		
		if(airline != null) {
			airline.type = "Boing";
			airline.capacity();
		}
		else {
			System.out.println("Pleasec check the pointer");
		}
		
	}
	
	
	
}
