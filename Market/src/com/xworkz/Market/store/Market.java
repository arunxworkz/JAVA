package com.xworkz.Market.store;

public class Market {

	private String name;
	private String location;
	
	public Market(String name, String location) {

		this.name = name;
		this.location = location;
	}
	
	public void show() {
		System.out.println("The name of market is : "+name);
		System.out.println("The name of location is : "+location);
	}
	
}
