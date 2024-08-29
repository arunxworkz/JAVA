package com.xworkz.gun.properties;

public class Godse {

	public Gun revolutionary() {
		
		// Gun.name = ""; - not possible because 'name' is declared as private
		
		Gun gun = new Gun("AR-15", 6, " Smith & Wesson Model 686"); // Once again Gun data typa is used as local variable inside the method of type Gun(return type).
		
		gun.fire();
		gun.display();
		return null; // madatory because it is user definer data type or a class data type
	}
	
	
}
