package com.xworkz.funcinterface.runner;

import com.xworkz.funcinterface.monday.Car;
import com.xworkz.funcinterface.monday.FoodApp;
import com.xworkz.funcinterface.monday.UseClass;
import com.xworkz.funcinterface.monday.UseFood;
import com.xworkz.funcinterface.monday.Vehicle;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle vehicle = ()->{ //Lambda function
			System.out.println("This is modification");
		};
		
		UseClass useClass = new UseClass();
		useClass.implementation(vehicle);
		
		/*Car car = new Car();
		car.run();*/
		
		
		
		FoodApp foodApp= (String item)->{
			System.out.println("Fodd is: "+item);
		};
		
		
		UseFood useFood = new UseFood();
		useFood.eat(foodApp);
	}

}
