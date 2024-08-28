package com.xworkz.Bottel.Runner;

import com.xworkz.Bottel.Bottle;
import com.xworkz.Bottel.Devu;
import com.xworkz.Bottel.Gunashree;

public class BottleRunner {
	
	public static void main(String[] args) {
		
		Bottle bottle = new Bottle();
		
		Gunashree gu = new Gunashree(); //local
		gu.local();
		
		System.out.println("================================");
		
		Devu devu = new Devu();
		devu.parameter(bottle);
	
	
	
	}
}
