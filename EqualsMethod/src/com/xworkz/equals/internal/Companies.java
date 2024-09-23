package com.xworkz.equals.internal;

public class Companies {

	String name;
	int noOfEmployees;
	String ceo;
	
	public Companies(String name, int noOfEmployees, String ceo){
		this.name = name;
		this.ceo = ceo;
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		System.out.println("Companies " + "\n" + "name: " + name + ", noOfEmployees: " + noOfEmployees + ", ceo: " + ceo);
		return "Companies " + "\n" + "name: " + name + ", noOfEmployees: " + noOfEmployees + ", ceo: " + ceo;
	}
	
	
	
	
	
}
