package com.xworkz.casting.internal;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class TataAirlines extends Airlines{

	public TataAirlines() {
		super("Tata Airlines");
	}
	
	@Override
	public Object clone() {   //method over-riding
		System.out.println("Clone method is overridden");
		return airLineName;
	}
	
	public Object clone(String statement){  //method overloading
		return statement;
	}
	
	public void display() {
		this.clone();
	}
	
}
