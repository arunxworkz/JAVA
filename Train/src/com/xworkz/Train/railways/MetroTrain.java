package com.xworkz.Train.railways;

public class MetroTrain extends SteamEngine{
	
	String name;
	int trainNo;
	int noOfEmployee;
	
	public MetroTrain(){
		super(null, null, 0);
	}
	
	public void display(String name, int trainNo, int noOfEmployee) {
		System.out.println("The name is: "+name);
		System.out.println("The train number is: "+trainNo);
		System.out.println("The number of Employee: "+noOfEmployee);
	}
	

}
