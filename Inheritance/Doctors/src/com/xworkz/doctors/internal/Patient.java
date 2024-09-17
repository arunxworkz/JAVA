package com.xworkz.doctors.internal;

public class Patient extends Psychotherapist, Dentist{

	/*Here the patient is a class which is having two parent class
	 * if try to invoke any of the properties from the patent class
	 * then JVM will get confuse about invoking the methods.
	 * Patient class can not inherit property form both classes.
	 * To over come this problem 'interface' concept is used with the 
	 * help of keyword 'implements'.*/
	
	
	
	
}
