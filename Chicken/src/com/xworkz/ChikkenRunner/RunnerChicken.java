package com.xworkz.ChikkenRunner;


import com.xworkz.ChikkenRunner.Food.Food;
import com.xworkz.ChikkenRunner.Food.Type.Tpye;

public class RunnerChicken {

	public static void main(String[] args) {
		
		// Type ty = new Food(); this is not possible 
	
		Tpye tp = new Tpye();
		
		Food ty = new Tpye();
		ty.chefName("Arun"); //accessing the method directly form the food
		tp.diaplsy();
		
		
	}
	
	
}
