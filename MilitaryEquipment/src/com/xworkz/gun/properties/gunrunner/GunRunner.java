package com.xworkz.gun.properties.gunrunner;

import com.xworkz.gun.properties.Gun;
import com.xworkz.gun.properties.Police;
import com.xworkz.gun.properties.Solider;

public class GunRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solider solider = new Solider();
		solider.local();
		
		System.out.println("=================================");
		
		Gun gun = new Gun(null, 0, "Revolver");
		Police police = new Police();
		
		/* police.parameter(null); - it will make the 'gun' reference of Gun class
		 * to point to the null memory where nothing is stored. To overcome this
		 * we need to check the whether 'gun' reference is pointing to null or
		 * any other memory location, in Plocie class.*/
		
		police.parameter(gun);
		
		System.out.println("=================================");
		
	}

}