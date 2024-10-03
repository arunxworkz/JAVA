package com.xworkz.exceptionhandling.internal;


/*Deligating the exception*/
public class Deligation {
	public void operate() throws IlligalOperation {
		Opeartion opeartion = new Opeartion();
		opeartion.sum(0);
		opeartion.sum(2);
		System.out.println("This after deligation of the exception");
	}	
	
	
/*Here the  System.out.println("This after deligation of the exception");
	 * will not work as the exception is beign delgeted insted of handling
	 * if we whouls have */
}
