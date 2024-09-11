package com.xworkz.forest.internal;

public class Department extends Forest{

	public Department(String santuaryName, String division) {
		super("Minister", 0, santuaryName, division);
	}
	
		public void display() {
			 System.out.println("Department: ");
			 super.printing();
		}
	
	
}
