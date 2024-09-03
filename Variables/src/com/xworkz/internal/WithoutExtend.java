package com.xworkz.internal;

public class WithoutExtend {

	Perfume perfume = new Perfume();
	/*In non-subclass we need to creat the object of the base class*/
	public void method() {
	perfume.name = "Denver";
	perfume.price = 500;
	}
	
	public void display() {
		System.out.println("Name is: "+perfume.name);
		System.out.println("Price is: "+perfume.price);
	}
	
}
