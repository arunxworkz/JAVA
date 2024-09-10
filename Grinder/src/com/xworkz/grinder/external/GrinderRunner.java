package com.xworkz.grinder.external;

import com.xworkz.grinder.internal.Grinder;
import com.xworkz.grinder.internal.Type;

public class GrinderRunner {

	public static void main(String[] args) {
		
		Grinder grinder = new Grinder("Prestige", 2500, 500, 5);
		grinder.equals(grinder);
		System.out.println(grinder);
		
		
		Type type = new Type();
		Grinder grinder1 = new Grinder("Prestige", 2500, 500, 5);
		grinder1.equals(grinder1);
		
		
		Grinder grinder2 = new Grinder("Prestige", 2500, 500, 5);
		Type type1 = new Type();
		grinder2.equals(type1);
		
		
		boolean same = grinder2.equals(grinder);
	}

}
