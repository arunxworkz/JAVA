package com.xworkz.Bottel;

public class Shwetha {

	public Bottle bottle;  //instance
	
	public void fold() {
		bottle.quantity = 50;
		
		if(bottle != null) {
			bottle.fill();
		}
		else {
			System.out.println("Nothing to print");
		}
	}
	
	
}
