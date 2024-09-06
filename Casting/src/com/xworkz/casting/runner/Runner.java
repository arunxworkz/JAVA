package com.xworkz.casting.runner;

import com.xworkz.casting.internal.Belt;
import com.xworkz.casting.internal.Dance;
import com.xworkz.casting.internal.LeathetBelt;

public class Runner {

	public static void main(String[] args) {
		
		Dance d = new Dance();
		Belt belt = new Belt();
		d.use(belt);
		
		//LeathetBelt leathetBelt = new LeathetBelt();
		
		System.out.println("====================================");
		
		Belt leathetBelt = new Belt();
		LeathetBelt leathetBelt1 = new LeathetBelt();
		d.use(leathetBelt1);
		System.out.println("====================================");
		Belt belt1 = new LeathetBelt();
		d.use(belt1);
		
	}
	
	
	
	
}
