package com.xworkz.saree.internal;

public class Saree {

	
	String type;
	double price;
	String color;
	String brand;
	
	public Saree(String type, double price, String color) {
		//super();
		this.type = type;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Saree [price=" + price + ", color=" + color + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Saree) {
				Saree casted = (Saree)obj;
				if(this.color.equals(casted.color) && this.price == casted.price) {
					System.out.println("This is true");
					return true;
				}
				else {
					System.out.println("Not same");
					return false;
				}
			}
			else {
				System.out.println("Not an instance");
				return false;
			}
		}else {
			System.out.println("null");
			return false;
	}
}
}
	
	

