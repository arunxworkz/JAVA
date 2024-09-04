package com.xworkz.first;

public class SmartPhone {

	protected String name;
	protected String brand;
	protected double price;
	
	public SmartPhone(String name, String brand, double price){
		this.name =name;
		this.brand = brand;
		this.price = price;
	}
	
	protected void getSmartPhone() {
		System.out.println("The smartphone is of brand: "+brand);
	}
	
	protected void price() {
		System.out.println("Price os smartphone is: "+price);
	}
	
	public void display() {
		System.out.println("The name from base class: "+name);
		System.out.println("The brand from base class: "+brand);
		System.out.println("The price from base class: "+price);
	}
	
}
