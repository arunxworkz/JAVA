package com.xworkz.SamrtPhone.phones;

public class Phone {
	
	String name;
	double price;
	String company;
	int storage;
	

	public void store(String name, double price, String company, int storage) {
		this.name = name;
		this.company = company;
		this.storage = storage;
		this.price = price;
	}
	
	public void dispaly() {
		System.out.println("NAme of the phone is: "+name);
		System.out.println("Comapny of the phone is: "+company);
		System.out.println("Storage of the phone is: "+storage);
		System.out.println("price of the phone is: "+price);
	}
	
}
