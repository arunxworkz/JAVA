package com.xworkz.washingmachine.electronicequipment;

public class WashingMachine {

	
	private String brand;
	private String type;
	private int capacity;
	
	public WashingMachine(String brand, String type, int capacity) {
		//super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	void rinse() {
		System.out.println(brand+" washing machine of type "+type+" has a capacity of "+capacity+" Kg");
	}
	
	void show() {
		System.out.println(brand+" brand washing machine has good rating");
	}
	
	void method() {
		System.out.println("Washing machine is used to wash the clothes");
	}
	
}
