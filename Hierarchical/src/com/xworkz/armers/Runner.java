package com.xworkz.armers;

import com.xworkz.armers.first.AK47;
import com.xworkz.armers.first.ShotGun;
import com.xworkz.armers.first.Weapons;

public class Runner {

	/*Here the sub classes are extending the same class weapon, therefore we can access only
	 * method or variables which are present in the base class.*/
	public static void main(String[] args) {
	ShotGun gun = new ShotGun();
	gun.shotGun();
	gun.armers();
	
	System.out.println("------------------------------------------");
	
	AK47 ak47 = new AK47();
	ak47.ak47();
	ak47.armers();
	
	System.out.println("------------------------------------------");
	
	Weapons weapons = new Weapons();
	weapons.armers();
	
	}
}
