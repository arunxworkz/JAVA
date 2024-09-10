package com.xworkz.kettle.internal;

public class Kettle {

	String brand;
	double price;
	int rating;
	boolean offer;
	int voltage;
	String size;
	
	public Kettle(int rating, boolean offer, int voltage) {
		//super();
		this.rating = rating;
		this.offer = offer;
		this.voltage = voltage;
	}

	void brand(String brand) {
		this.brand = brand;
		System.out.println("The brand: "+brand);
	}
	
	public void price(double price) {
		this.price = price;
		System.out.println("Price: "+price);
	}
	 
	public void size(String size) {
		this.size = size;
		System.out.println("Size: "+size);
	}
	

	@Override
	public String toString() {
		return "Kettle [brand=" + brand + ", price=" + price + ", rating=" + rating + ", offer=" + offer + ", voltage="
				+ voltage + ", size=" + size + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Omkar) {
				Kettle casted = (Kettle) obj;
				if(this.rating == casted.rating && this.voltage == casted.voltage) {
					//price(price);
					//size(size);
					System.out.println("This is done contenets are equal");
					return true;
				}
				else {
					System.out.println("Different so no price and no size");
					return false;
				}
			}
			else {
				System.out.println("Check the reference");
				return false;
			}
		}
		else {
			System.out.println("NUll");
			return false;
		}
		
	}
	
}
