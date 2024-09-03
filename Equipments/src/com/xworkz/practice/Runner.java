package com.xworkz.practice;

import com.xworkz.external.Ramsh;
import com.xworkz.internal.Ragu;

public class Runner {

	public static void main(String[] args) {
		
		
		Ragu ragu = new Ragu();
		ragu.method();
		
		System.out.println("=-------------------------------------");
		
		Ramsh rmash = new Ramsh();
		rmash.weapon();
		rmash.gun();
	}

}
