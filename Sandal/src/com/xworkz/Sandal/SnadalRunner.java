package com.xworkz.Sandal;

import com.xworkz.Sandal.store.SandalData;
import com.xworkz.Sandal.store.display.Data;

public class SnadalRunner {

	public static void main(String[] args) {
		
		SandalData s = new SandalData("Bata", 'L', 5220.2, "Brown");
		SandalData s1 = new SandalData("Puma", 'M', 6220.2, "Balck and White");
		SandalData s2 = new SandalData("Nike", 'M', 6000, null);
		SandalData s3 = new SandalData("Adidas", 'L', 4000, "Sky Blue");
		Data d = new Data();
		
		/*Data d1 = new Data();
		d.print();  no necessary of creating of one or more instances of the 'Data' class*/

		d.store(s);
		d.store(s1);
		d.store(s2);
		d.store(s3);
		d.print();
		
		
	}

}
