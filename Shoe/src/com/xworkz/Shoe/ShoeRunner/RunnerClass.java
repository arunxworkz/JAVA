package com.xworkz.Shoe.ShoeRunner;

import com.xworkz.Shoe.Divya;
import com.xworkz.Shoe.Harshitha;
import com.xworkz.Shoe.Omkar;
import com.xworkz.Shoe.Shoe;


public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divya divya = new Divya();
		
		divya.local();
		
		Omkar omkar = new Omkar();
		
		Shoe shoe = new Shoe();
		omkar.method(shoe);
		
		Harshitha hr = new Harshitha();
		hr.fold();
		
		Shoe shoe1 = new Shoe();
		shoe1.brand = "Puma";
		
		hr.shoe = shoe1;
		hr.fold();
		
		
	}

}
