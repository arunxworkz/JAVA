package com.xworkz.employeedetails.internal;

public class DataStore {

	private Details[] arr = new Details[5];
	private int index = 0; // privated so that other class can not access
	
	public void store(Details d) {
		if(index < arr.length) {
			arr[index] = d;
			index++;
		}
		else {
			System.out.println("Array index out of range");
			System.out.println("-----------------------------------------");
		}
	}
	

	public void display()
	{
		for(Details del: arr) {
			if(del != null) {
				del.toString();
				System.out.println("-----------------------------------------");
			}
		}
	}
	
	
}
