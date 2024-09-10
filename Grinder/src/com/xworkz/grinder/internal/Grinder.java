package com.xworkz.grinder.internal;

public class Grinder {

	
	String company;
	double price;
	int capacity;
	int ratings;
	
	public Grinder(String company, double price, int capacity, int ratings) {
		//super();
		this.company = company;
		this.price = price;
		this.capacity = capacity;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Grinder [company=" + company + ", price=" + price + ", capacity=" + capacity + ", ratings=" + ratings
				+ "]";
	} 
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Grinder) {
				//Grinder casted = (Grinder) obj;
				if(this.capacity == capacity && this.ratings == ratings) {
					System.out.println("Information are equal");
					return true;
				}
				else {
					System.out.println("Not equal");
					return false;
				}
			}
			else {
				System.out.println("Not an instance");
				return false;
			}
		}
		else {
			System.out.println("Null");
			return false;
		}
	}
	
	
}
