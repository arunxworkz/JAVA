package com.xworkz.casting.internal;

public class Wings {

	public void casting(Airlines tataAirlines) {
		
		if(tataAirlines instanceof TataAirlines) {
			
			Airlines catedTataAirlines = (Airlines)tataAirlines;
			catedTataAirlines.fly();
		}
		else {
			System.out.println("Check the reference");
		}
		
	}
	
	
	
}
