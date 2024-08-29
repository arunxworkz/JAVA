package com.xworkz.Airlines.lift;

public class Airline {

	String type;
	String airlineName;
	int capacity;
	
	public Airline(String type, String airlineName, int capacity) {
		//super();
		this.type = type;
		this.airlineName = airlineName;
		this.capacity = capacity;
	}
	
	void sample() {
		System.out.println("This aeroplane is of "+airlineName+" company");
	}
	
	void capacity() {
		System.out.println("Th capacity is: "+capacity);
	}
	
	
	void type() {
		System.out.println("The aeroplane type is: " +type);
	}
	
	
	void method() {
		System.out.println("This is a aeroplane");
	}
}
