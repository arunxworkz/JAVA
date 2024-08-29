package com.xworkz.gun.properties;

public class Gun {
	
	private String name;
	private int noOfRounds;
	private String type;
	
	public Gun(String name, int noOfRounds, String type) {
		//super();
		this.name = name;
		this.noOfRounds = noOfRounds;
		this.type = type;
	}
	
	void fire() {
		System.out.println(name+" has a capaity to fire "+noOfRounds+" bullet");
	}
	
	void display()
	{
		System.out.println("The gun type is "+type);
	}
}
