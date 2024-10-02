package com.xworkz.cating.runner;

import com.xworkz.cating.internal.Human;
import com.xworkz.cating.internal.Male;

public class Runner {

	public static void main(String[] arr) {
		
		//Upcasting
		Human human = new Male();
		human.sleep();
		/*The out put will be sleep for 8 hours
		 * which is from the child class as the method 
		 * int the child calss is over ridden */
		
		Human human1 = new Male();
		human1.run();
		/*This is from the base class Human as the method is form the 
		 * base class. The reference is of base class and child class
		 * object id created, since the method is not over ridden the 
		 * method for the base class is invoked.*/
		
		System.out.println("-----------------------------------------------");
		
		//Downcasting
		
		Human human2 = new Male();
		if(human2 instanceof Male) {
			Male male = (Male)human2;
			male.work();
		}
		
		Human human3 = new Human();
		if(human3 instanceof Male) {  //class cast exception will occur if type check is not done and casting is not done
			Male male = (Male)human3;  //Downcasting
			male.work();
		}	
	}
	
	
}
