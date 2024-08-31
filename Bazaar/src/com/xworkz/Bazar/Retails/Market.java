package com.xworkz.Bazar.Retails;

public class Market {

	private String name;
	private String type;
	private String location;
	private int noOfShpos;
	
	
	public Market() {
		System.out.println("This is zero parameterized constructor");
	}
	
	public Market(String name, String type, String location, int noOfShpos) {
		this.name = name;
		this.type = type;
		this.location = location;
		this.noOfShpos = noOfShpos;
	}
	
	public void display() {
		System.out.println("Name is: "+name);
		System.out.println("Type is: "+type);
		System.out.println("Location is: "+location);
		System.out.println("Number of sgops: "+noOfShpos);
	}
	
	public void method() {
		System.out.println("Method for local variables");
	}
	
	
}
