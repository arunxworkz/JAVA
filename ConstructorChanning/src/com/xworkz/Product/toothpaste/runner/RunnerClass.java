package com.xworkz.Product.toothpaste.runner;

import com.xworkz.Product.toothpaste.Paste;

public class RunnerClass {

	public static void main(String[] args) {
		
		Paste paste = new Paste("Ptanjali", "Dantkanthi"); 
		paste.disply();
		
		
		System.out.println("------------------------------------------------");
		
		Paste paste1 = new Paste("Dnatkanthi"); 
		paste1.disply();
		
		System.out.println("------------------------------------------------");
		
		Paste paste2 = new Paste(); // this does not require argument to be passed
		paste2.disply();
		
	}

}
