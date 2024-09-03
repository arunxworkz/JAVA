package com.xworkz.internal;

public class WildStone extends Perfume{
	
	/*Here we need to create the constuctor as there is no zero parameterized constuctoe 
	 * present in the Perfume class - optional*/

	
	
	
		
		
		
	public void display() {
		/* No concept of iver riding of the variable it is bassically hidding the variables*/
		name = "Fog";
		price = 800;
		System.out.println("Name in child class: "+name);
		System.out.println("Price in child class: "+price);
		
		System.out.println("Name in parent class: "+super.name);
		System.out.println("Price in parent class: "+super.price);
	}
	
}
