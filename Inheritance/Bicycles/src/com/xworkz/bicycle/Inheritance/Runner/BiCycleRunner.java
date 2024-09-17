package com.xworkz.bicycle.Inheritance.Runner;

import com.xworkz.bicycle.Inheritance.ElectricBike;
import com.xworkz.bicycle.Inheritance.MotorCycle;

public class BiCycleRunner {

	public static void main(String[] args) {
		
		ElectricBike eb = new ElectricBike("Runs on electric charge", "Electricity", 50);
		eb.toString();
		
		/*In Java, we can only assign a child class (subclass) object to a parent class reference.
		 * */
		System.out.println("--------------------------------------------");
		
		//ElectricBike eb1 = new MotorCycle("Runs on petrol", "Petrol");
		
		MotorCycle motorCycle = new ElectricBike("Electric chager is required", "Electric battery", 80);
		motorCycle.method();
		motorCycle.toString();
		
		System.out.println("--------------------------------------------");
		
		MotorCycle motorCycle1 = new MotorCycle("Runs on pertoml", "Petrol");
		motorCycle1.toString();
	}
	
	
}
