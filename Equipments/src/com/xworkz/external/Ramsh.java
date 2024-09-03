package com.xworkz.external;

import com.xworkz.internal.Gun;
import com.xworkz.internal.Weapon;

public class Ramsh {

	Weapon weapon = new Weapon();
	Gun gun = new Gun();
	
	public void weapon() {
		weapon.use(); // Here there is a problem because the use method is protected and it is present in the weapon class	
		weapon.fire();
	}
	
	public void gun() {
		gun.use(); // Here there is a problem because the use method is protected and it is present in the Gun class	
		gun.fire();
	}
	
	
}
