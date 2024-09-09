package com.xworkz.casting.external;

import com.xworkz.casting.internal.Airlines;
import com.xworkz.casting.internal.TataAirlines;
import com.xworkz.casting.internal.Wings;

public class Runner {
		
	public static void main(String[] args) {
		Wings wings = new Wings();
		TataAirlines tataAirlines = new TataAirlines();
		
		System.out.println("------------------------------");
		
		tataAirlines.fly();
		tataAirlines.display();
		
		tataAirlines.clone("Function has been overloaded");
		
		System.out.println("------------------------------");
		
		Airlines tataAirlines1 = new Airlines("Boing");
		
		System.out.println("------------------------------");
		
		TataAirlines tataAirlines2 = new TataAirlines();
		
		System.out.println("------------------------------");
		
		wings.casting(tataAirlines1);
		
		System.out.println("------------------------------");
		
		TataAirlines tataAirlines3 = new TataAirlines();
		wings.casting(tataAirlines3);
	}
	
}
