package com.xworkz.saree.runner;

import com.xworkz.saree.internal.Saree;

public class Runner {

	public static void main(String[] args) {
		Saree saree = new Saree("Rashme", 5000, "RED");
		Saree saree2 = new Saree("Rashme", 5000, "RED");
		saree2.equals(saree);
	}
}
