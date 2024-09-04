package com.xworkz.internal;

public class Device {

	String name;
	String action;
	public void name(String name) {
		this.name = name;
		System.out.println("Device name is: "+name);
	}
	
	public void action(String action) {
		this.action = action;
		System.out.println(name+" "+action);
	}
	
}
