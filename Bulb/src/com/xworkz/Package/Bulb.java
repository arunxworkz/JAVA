package com.xworkz.Package;

public class Bulb {
	
	double price;
	
	
	public Bulb(){
		System.out.println("Its is for our understanding");
		System.out.println("This is bulb class constructor");
	}
	
	public void display(double price) {
		this.price = price;
		System.out.println("The price of bulb is: "+price);
	}
	
}
