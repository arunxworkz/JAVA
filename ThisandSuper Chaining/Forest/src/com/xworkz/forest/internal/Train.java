package com.xworkz.forest.internal;

public class Train {

	static String trainName;
	static int noOfCoaches;
	static int length;
	static String minister;
	static String destinations;
	static String source;
	
	public Train(String trainName, int noOfCoaches, int length) {
		//super();
		this("Ashwini Vaishnaw");
		this.trainName = trainName;
		this.noOfCoaches = noOfCoaches;
		this.length = length;
	}
	
	
	public Train(String minister) {
		this("Banglore", "Kadur");
		this.minister = minister;
	}
	
	public Train(String source, String destinations) {
		this.source = source;
		this.destinations = destinations;
	}
	
	public static void main(String[] args) {
		Train train = new Train("Jan Shatabdhi", 15, 250);
		System.out.println("NAme: "+trainName);
		System.out.println("Number of coaches: "+noOfCoaches);
		System.out.println("Length: " + length);
		System.out.println("Minister: "+minister);
		System.out.println("Source: "+source);
		System.out.println("Destinations: "+destinations);
	}
	
	
}
