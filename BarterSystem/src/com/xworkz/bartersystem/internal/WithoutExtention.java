package com.xworkz.bartersystem.internal;

public class WithoutExtention {

	@Override
	public Object clone() {
		
		System.out.println("The clone method is over ridden");
		
		return null;
	}
	
	
	
	
	public void method(Product product) {
		
		if(product instanceof Seller) {
			Seller seller=(Seller)product;
			seller.seller();
		}
		else {
			System.out.println("Check the referencec");
		}
	}
	
	
}
