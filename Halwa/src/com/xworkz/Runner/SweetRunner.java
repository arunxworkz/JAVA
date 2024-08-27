package com.xworkz.Runner;

import cm.xworkz.Sweet.Tirunelveli.Sweet;
import cm.xworkz.Sweet.Tirunelveli.Tamilndu.SweetNames;

public class SweetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sweet sw = new SweetNames();
		
		SweetNames sn = new SweetNames(); 
		
		//sn.store("Halwa", 250.365, "TamilNadu");
		sn.ingredient("jagggery");
		sw.store("Halwa", 250.365, "TamilNadu");
		sw.display();
		
		
		
		
	}

}
