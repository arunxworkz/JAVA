package com.xworkz.bicycle.Inheritance;

public class Bicycle {

	String working;

	public Bicycle(String working) {
		super();
		this.working = working;
	}

	@Override
	public String toString() {
		System.out.println("Bicycle-working: " + working);
		return "Bicycle-working: " + working;
	}
	
	
	
	
	
}
