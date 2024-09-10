package com.xworkz.kettle.external;

import com.xworkz.kettle.internal.Kettle;
import com.xworkz.kettle.internal.Omkar;

public class Runner {

	public static void main(String[] args) {
		Kettle kettle = new Kettle(4, false, 220);
		System.out.println(kettle); //toString();
		
		System.out.println("---------------------------------------");
		
		Kettle kettle1 = new Kettle(5, false, 500);
		Omkar omkar1 = new Omkar(5, false, 500);
		kettle1.equals(kettle1);   // Output: check the reference. This will be obtained only if we are checking the instance of the omkar type thet is subclass
		//
		
		
		System.out.println("---------------------------------------");
		
		Omkar omkar = new Omkar(3, true, 150);
		Kettle kettle2 = new Kettle(3, true, 150);
		kettle2.equals(omkar);   //output : This is done contents are equal
		
		
	      // Omkar omkar = new Omkar(3, true, 150);
	       //Kettle kettle2 = new Kettle(3, true, 150);

	        // Compare the two instances using equals method
	        //boolean areEqual = kettle2.equals(omkar);
		
	}
	
}
