package com.xworkz.vehicles.engine.motor;

import com.xworkz.vehicles.engine.Vehicle;

public class Car extends Vehicle{
	
	@Override
	public void accelerate() {
		System.out.println("This is Car extended from Vehicle");
	}
	
	public void stop() {
		System.out.println("This is stop from subclass Car");
	}
	
	public void method() {
		 super.stop();
	}
	

}
