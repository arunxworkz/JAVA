package com.xworkz.Market.store.show;

import com.xworkz.Market.store.Market;

public class Data {
		
	private Market[] ma = new Market[5];
	private int i = 0;
	
	public void store(Market data) {
		ma[i] = data;
		i++;
	}
	
	public void display() {
		System.out.println("The markets are: ");
		for(Market ele: ma) {
			/* System.out.println(ele); - here the string representation is 
			 * diaplyed when ever the data is assigned to the 'ele' which is an reference of 
			 * Market. Therefore we can chek the not null condition*/
			if(ele != null) { // condition is to avoid null pointer exception
				ele.show();
				//System.out.println(ele);
			}
			else {
				System.out.println("Nothing to print");
			}
		}
	}
	
}
