package com.xworkz.Package.Extends.Runner;

import com.xworkz.Package.Bulb;
import com.xworkz.Package.Extends.Tubelight;

public class BulbRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tubelight tubeLight = new Tubelight();
		tubeLight.display(25.26);
		
		Bulb bulb = new Tubelight();
		
		
		Tubelight tu = new Bulb(); // Type mismatch can not convert from bulb to tubelight
	}

}
