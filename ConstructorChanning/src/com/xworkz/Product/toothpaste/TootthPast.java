package com.xworkz.Product.toothpaste;

public class TootthPast {

	private String name;
	private String company;
	private double cost;
	
	//constructor are only used for initializing the instance variables and for chaining  to can not be acessed unlike methods and variables.
	
	public TootthPast(String name, String company) {
		this.name = name;
		this.company = company;
		System.out.println("This is 2 parameter constructor");
	}
	
	
	public TootthPast(String company) {
		this.company = company;
		System.out.println("This is 1 parameter constructor");
	}
	
	/*public TootthPast(String name) {
		this.name = name;
	} this wil be an erroe becaues no two constructor can have same data type parameter*/ 
	
	public TootthPast(double cost) {
		this.cost = cost;
		System.out.println("This is double data type constructor");
	}
	
	
	public void disply() {
		System.out.println("The company: "+company);
		System.out.println("The name of the toothpaste: "+name);
		System.out.println("The price of the toothpaste: "+cost);
	}
	
}
