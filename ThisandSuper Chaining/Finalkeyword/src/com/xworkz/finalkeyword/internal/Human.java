package com.xworkz.finalkeyword.internal;

public class Human {

	
	float height;
	int weight;
	String gender;
	final boolean humaninty = false;


	public Human(int height, int weight, String gender) {
		//super();
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public final void method() {
		System.out.println("This is a humna class");
	}
	
	public void printing() {
		System.out.println("The height: "+height);
		System.out.println("The weight: "+weight);
		System.out.println("The gender: "+gender);
	}
	
}
