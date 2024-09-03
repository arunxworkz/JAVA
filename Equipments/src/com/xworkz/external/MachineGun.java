package com.xworkz.external;

import com.xworkz.internal.Weapon;

public class MachineGun extends Weapon{ // here we need to import the package as it is of different package

	@Override
	protected void use() {
		System.out.println("Use of weapon in MachineGun");
	}
	
	@Override
	public void  fire() {
		System.out.println("firing gun in MachineGun");
	}
	
	void mrthod() {
		fire();
		use();
	}
	
}
