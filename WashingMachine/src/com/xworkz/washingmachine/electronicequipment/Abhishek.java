package com.xworkz.washingmachine.electronicequipment;

public class Abhishek {

	public WashingMachine washingMachine;
	
	public void fold() {
		
		if(washingMachine != null) {
			washingMachine.rinse();
			washingMachine.show();
			washingMachine.method();
		}
		else {
			System.out.println("Check the reference of WashingMachine");
		}
	}
	
}
