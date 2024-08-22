package com.xworkz.Sandal.store;

public class SandalData {
	
	private String brand;
	private char size;
	private double cost;
	private String color;
	
	public SandalData(String brand, char size, double cost, String color) {
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
	
	public void show() {
		System.out.println("The barnd: "+brand);
		System.out.println("The Size: "+size);
		System.out.println("The Cost: "+cost);
		System.out.println("The Color: "+color);
		System.out.println("========================================");
	}
	
	
	
}
