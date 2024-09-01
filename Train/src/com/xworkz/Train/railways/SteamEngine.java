package com.xworkz.Train.railways;

public class SteamEngine {

	
	/*Tight coupling - It relates to the inheritance, where the subclass extends the
	 * properties of the superclass. When the super class is modified the sub class is also
	 * affected in its behavior. It is refereed as 'Is-A' relation*/
	
	/*Loose coupling - It is refereed as 'Has-A' relation where the any modification in super class
	 * will not affect the sub class as the sub class is not inheriting the any kind of 
	 * properties for the super class. Here the one class can be used as reference in another
	 * class.*/
	
	
	
	private String source;
	private String destination;
	private int noOfPlatform;
	
	
	public SteamEngine(String source, String destination, int noOfPlatform) {
		
		this.source = source;
		this.destination = destination;
		this.noOfPlatform = noOfPlatform;
		
	}
	
	public void source() {
		System.out.println("The source is: "+source);
	}
	
	public void destinnation() {
		System.out.println("The destination is: "+destination);
	}
	
	
	public void noOfPlatform(int noOfPlatform) {
		System.out.println("The number of platforms are: "+noOfPlatform);
	}
	
}
