package com.xworkz.bicycle.Inheritance;

public class MotorCycle extends Bicycle{

	String gas;
	
	public MotorCycle(String working, String gas) {
		super(working);
		this.gas = gas;
		// TODO Auto-generated constructor stub
	}
	
	public void method() {
		System.out.println("The gas used is: "+gas);
	}

}
