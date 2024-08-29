package com.xworkz.washingmachine.electronicequipment.runner;

import com.xworkz.washingmachine.electronicequipment.Abhishek;
import com.xworkz.washingmachine.electronicequipment.Bhumika;
import com.xworkz.washingmachine.electronicequipment.Lakshmi;
import com.xworkz.washingmachine.electronicequipment.Megha;
import com.xworkz.washingmachine.electronicequipment.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Megha megha = new Megha();
		megha.local();
		
		System.out.println("==========================");
		
		WashingMachine washingMachine = new WashingMachine(null, null, 0);
		Lakshmi lakshmi = new Lakshmi();
		lakshmi.parameter(washingMachine); // here argument has to be passed of type WashingMachine

		System.out.println("==========================");
		
		Abhishek abhishek = new Abhishek();
		WashingMachine washingMachine1 = new WashingMachine("Tata", "Top-load", 12);
		abhishek.washingMachine = washingMachine1;
		abhishek.fold();
		
		System.out.println("==========================");
		
		Bhumika bhumika = new Bhumika();
		bhumika.method();
	}

}
