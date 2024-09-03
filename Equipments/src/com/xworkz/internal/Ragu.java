package com.xworkz.internal;

public class Ragu { // not extending the base class Weapon
 
	public void method() {
		Weapon weapon = new Weapon();
		weapon.use();  //No problem - because the protected method use is in the same package
		weapon.fire(); 
		
		System.out.println("----------------------------------");
		
		Gun gun = new Gun();
		gun.use();
		gun.fire();
	}
	
	
}
