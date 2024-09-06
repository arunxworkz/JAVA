package com.xworkz.casting.internal;

public class Dance {

	public void use(Belt belt) {
		
		//Belt belt1 = new Belt();
		
		//System.out.println("Invoking the parent method");
		
		belt.tie();
		
		if(belt instanceof LeathetBelt) {
			LeathetBelt leathetBelt = (LeathetBelt)belt;
			leathetBelt.clip();
		}
		else {
			System.out.println("Check the refrence");
		}
		
		
	}
	
	
}
