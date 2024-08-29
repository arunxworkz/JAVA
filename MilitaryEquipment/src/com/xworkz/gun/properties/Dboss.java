package com.xworkz.gun.properties;

public class Dboss {

	public Gun gun;
	
	public void fold() {
		
		if(gun != null) {
			gun.fire();
		}
		else {
			System.out.println("Please check the pointer gun");
		}
	}
	
	
}
