package com.xworkz.washingmachine.electronicequipment;

public class Lakshmi {

	public void parameter(WashingMachine washingMachine) { // as parameter
		
		
		/* washingMachine.method(); - It will work when something is passed as argument 
		 * of type WasWashingMachine, if not then check the below condition*/
		
		if(washingMachine != null) {
			washingMachine.method();
		}
		else {
			System.out.println("Check the reference of WashingMachine");
		}
	}
	
}
