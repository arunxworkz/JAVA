package com.xworkz.finalkeyword.internal;

public class Male extends Human{
	
	boolean humanity = true; //this becomes a new variable in this class
	public final boolean humanity1 = true; // this is also new variable in this class.
	
	
	
	public Male(int height, int weight, String gender) {
		super(height, weight, gender);
	}
	
	public void method() {
		   System.out.println("final method can be used but can not be over ridden"); //
	}
		
	void overrideVariable() {
		//super.humaninty = true; // since it is final in super class it can not be over ridden. However it can be used 
		System.out.println(super.humaninty);
	}

	public void display() {
		System.out.println("The weight: "+weight);
		System.out.println("The gender: "+gender);
	}
}
