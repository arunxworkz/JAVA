package com.xworkz.SideDish.store;

public class Dish {
	
	private String name;
	private double price;
	
	public Dish(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println("The name is: "+name);
		System.out.println("The price is: "+price);
		System.out.println("=============================");
	}
	
}
