package com.xworkz.exceptionhandling.runner;

import com.xworkz.exceptionhandling.internal.Deligation;
import com.xworkz.exceptionhandling.internal.IlligalOperation;
import com.xworkz.exceptionhandling.internal.Opeartion;



public class Runner {
	public static void main(String[] args) {
		
		Deligation deligation = new Deligation();
		try {
			deligation.operate();
		} catch (IlligalOperation e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // This is oprtional. Used to print the stack trace. 
		}
		System.out.println("After handling the exception"); 
		/*The above print line will be executed as we are handling the exception
		 *with the help of try and a catch block*/
	}
}
