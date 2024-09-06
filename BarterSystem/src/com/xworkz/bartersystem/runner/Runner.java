package com.xworkz.bartersystem.runner;


import com.xworkz.bartersystem.internal.Product;
import com.xworkz.bartersystem.internal.Seller;
import com.xworkz.bartersystem.internal.WithoutExtention;

public class Runner {

	public static void main(String[] args) {
		
		WithoutExtention withoutExtention = new WithoutExtention();
		//withoutExtention.clone();
		
		//Product product = new Product();
		//withoutExtention.method(product);
	
		Product seller = new Product();
		withoutExtention.method(seller);
		
	}

}
