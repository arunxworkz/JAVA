package com.xworkz.forest.external;

import com.xworkz.forest.internal.Department;
import com.xworkz.forest.internal.Forest;

public class Runner {

	public static void main(String[] args) {

		
		Forest forest = new Forest("ESHWAR KHANDRE", 30, "Bhadra Tiger Reserve", "Muthoodi");
		System.out.println(forest);
		
		System.out.println("------------------------------------------");
		
		Department department = new Department("Bandipur Tiger Reserve", "Bandipura");
		department.display();
		

	}

}
