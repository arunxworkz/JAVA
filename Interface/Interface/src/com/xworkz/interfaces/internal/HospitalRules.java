package com.xworkz.interfaces.internal;

public class HospitalRules implements HospitalRule{

	public void printVariables() {
		System.out.println("The variable is phNo: "+HospitalRule.phNo);
		System.out.println("The variable is phNo: "+phNo);
	}
	
	public void maintaicSilence() {
		System.out.println("Maintain silence please");
	}
	
	public void wearMaks() {
		System.out.println("Wear maks inside the hospital");
	}
	
	public void donotUsePhone() {
		System.out.println("Sitch off you phone in side the hosplital");
	}
	
}
