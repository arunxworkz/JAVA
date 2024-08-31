package com.xworkz.Product.toothpaste;

public class Paste extends TootthPast{

	/* here the Paste class will show erroe as there is no constructor is present in the
	 * ToothPaste class with zero parameter*/
	
	public Paste(String company, String name) {
		super(company, name);
		System.out.println("This is eplicit assignment of the reference");
	}
	
	static {
		System.out.println("==================================");
	}
	
	public Paste(String name) {
		super(name);
		System.out.println("With one parameter");
	}
	
	public Paste() {
		super(25.36);
		System.out.println("This is implicit reference");
	}
	
}
