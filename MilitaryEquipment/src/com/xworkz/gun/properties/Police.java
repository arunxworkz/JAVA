package com.xworkz.gun.properties;

public class Police {
	
	public void parameter(Gun gun) {
		
		//gun.type = "Revolver"; acn not do this because it is an private member
		
		if(gun != null) {
			gun.display();
		}
		else {
			System.out.println("Please check the location to which gun reference is pointing to");
		}
	}
}
