package com.xworkz.exceptionhandling.internal;

public class Opeartion {

	
	public void sum(int number) throws IlligalOperation {
		int sum = 0;
		if(number <= 0) {
			System.out.println("Cannot perform sum opertaion");
			throw new IlligalOperation();
		}
		else {
			for(int i =0 ;i <= number; i++) {
				sum = sum + number;
			}	
			System.out.println("The sum is: "+sum);
		}
	}
	
	
}
