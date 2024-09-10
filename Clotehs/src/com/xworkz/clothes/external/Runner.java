package com.xworkz.clothes.external;

import com.xworkz.clothes.internal.Jeans;
import com.xworkz.clothes.internal.Material;

public class Runner {

	public static void main(String[] args) {
	
		Jeans jeans = new Jeans("Pant", "M", true);
		System.out.println(jeans); /*toString() method is automatically invited 
		without creating any extra method to print the data. This is mainly use in 
		user interface. Even if do not mention it will be invoked automatically.*/
		
		System.out.println("------------------------------------------------------");
		Material material1 = new Material("Shirt", "M", true);
		Jeans jeans1 = new Jeans("Shirt", "M", true);
		jeans1.equals(jeans1); // output:Check the reference
		
		System.out.println("------------------------------------------------------");
		
		Material material = new Material("Shirt", "M", true);
		boolean same = jeans1.equals(material);
		System.out.println(same); //This is Up-casting . Material will be type casted into Jeans
		
		System.out.println("------------------------------------------------------");
		Material material2 = new Material("Torn jeans", "M", true);
		Jeans jeans3 = new Jeans("Torn jeans", "M", false);
		jeans3.equals(null); // Output will be null 
	}
	
}
