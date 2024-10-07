package com.xworkz.funcinterface.monday;

public class UseClass {

	
	public void implementation(Vehicle vehicle) {
		if(vehicle != null) {
			vehicle.run();
		}
		else {
			System.out.println("Check the reference");
		}
	}
	
	
}
