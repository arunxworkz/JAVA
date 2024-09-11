package com.xworkz.finalkeyword.internal;

public final class FinalClass {

	String sentence;
	
	public String method(String sentence) {
		this.sentence = sentence;
		System.out.println("This is Final class. Printitg the senetence: "+sentence);
		return "Today is a good day";
	}
	    
	
	
}
