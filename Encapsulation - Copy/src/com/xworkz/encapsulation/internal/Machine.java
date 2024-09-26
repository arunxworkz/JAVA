package com.xworkz.encapsulation.internal;

public abstract class Machine {

	
	abstract void  run();
	
	public void work() { // Abstract class method(concret method)
		System.out.println("This is working machine");
	}
}
