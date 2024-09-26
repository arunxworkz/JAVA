package com.xworkz.exception.internal;

public class Price {

	public int method(int price) {
		if(price < 100 ) {
			throw new BookException();
		}
		else {
			return 0;
		}
	}
	
	
}
