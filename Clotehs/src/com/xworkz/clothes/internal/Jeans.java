package com.xworkz.clothes.internal;

public class Jeans {

	String type;
	String type1;
	double price;
	String brand;
	String size;
	boolean comfort;
	
	public Jeans(String type, String type1, double price, String brand, String size, boolean comfort) {
		//super();
		this.type = type;
		this.type1 = type1;
		this.price = price;
		this.brand = brand;
		this.size = size;
		this.comfort = comfort;
	}

	public Jeans(String type, String size, boolean comfort) {
		//super();
		this.type = type;
		this.size = size;
		this.comfort = comfort;
	}

	@Override
	public String toString() {
		return "Type: " + type + ", Size: " + size + ", Comfort: " + comfort;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	    if (obj != null) {
	        if (obj instanceof Material) {	
	            Jeans casted = (Jeans) obj; // here the object material is type casted into Jeans 
	            if (this.type.equals(casted.type) && this.size.equals(casted.size)) {
	                System.out.println("Same");
	                return true;
	            } else {
	                System.out.println("Different");
	                return false;
	            }
	        } else {
	            System.out.println("Check the reference");
	            return false;
	        }
	    } else {
	        System.out.println("null");
	        return false;
	    }
	}

	
}
