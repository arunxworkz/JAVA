package com.xworkz.bicycle.Inheritance;

public class ElectricBike extends MotorCycle{

	int speed;
	
	public ElectricBike(String working, String gas, int speed) {
		super(working, gas);
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println("ElectricBike-speed: " + speed);
		System.out.println("Gas used: " + gas);
		System.out.println("Workign: " + working);
		return "ElectricBike-speed: " + speed;
	}
	
	

}
