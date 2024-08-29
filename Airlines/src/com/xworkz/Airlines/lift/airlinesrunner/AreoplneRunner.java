package com.xworkz.Airlines.lift.airlinesrunner;

import com.xworkz.Airlines.lift.Airline;
import com.xworkz.Airlines.lift.Destination;
import com.xworkz.Airlines.lift.FamilyMan;
import com.xworkz.Airlines.lift.Instance;
import com.xworkz.Airlines.lift.Source;

public class AreoplneRunner {

	public static void main(String[] args) {
		
		
		Source source = new Source();
		source.local();
		
		System.out.println("===============================");
		
		Destination destination = new Destination();
		destination.parameter(null);
		
		System.out.println("===============================");
		
		Instance instance = new Instance();
		Airline airline = new Airline("Cargo", "Boing", 250);
		instance.instance();
		
		System.out.println("===============================");
		
		FamilyMan familyMan = new FamilyMan();
		familyMan.method();
	}
	
}
