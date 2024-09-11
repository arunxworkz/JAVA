package com.xworkz.bedsheet.internal;

public class BeedSheet {

	String color;
	double price;
	int length;
	String size;
	
	public BeedSheet(String color, double price, int length, String size) {
		//super();
		this.color = color;
		this.price = price;
		this.length = length;
		this.size = size;
	}

	@Override
	public String toString() {
		return "BeedSheet [color=" + color + ", length=" + length + ", size=" + size + "]";
	}
	 
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof BeedSheet) {
				BeedSheet casted = (BeedSheet) obj;
				if(casted.color.equals(this.color) && casted.length == this.length) {
					System.out.println("Information are equal");
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	
	
}


