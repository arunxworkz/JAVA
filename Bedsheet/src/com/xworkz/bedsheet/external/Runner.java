package com.xworkz.bedsheet.external;

import com.xworkz.bedsheet.internal.BeedSheet;
import com.xworkz.bedsheet.internal.Gun;

public class Runner {

	
	public static void main(String[] args) {
		
		BeedSheet beedSheet = new BeedSheet("Black and dwhite", 500, 50, "Large");
		
		
		BeedSheet beedSheet1 = new BeedSheet("Black and dwhite", 500, 40, "Large");
		beedSheet.equals(beedSheet1);
		
		Gun gun = new Gun("Ak47", "assult", 250);
		Gun gun1 = new Gun("Ak47", "assult", 250);
		gun.equals(gun1);
	}
}
