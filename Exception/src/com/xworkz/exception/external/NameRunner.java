package com.xworkz.exception.external;

import com.xworkz.exception.internal.NameException;
import com.xworkz.exception.internal.Price;

public class NameRunner {

	public void method(int age) throws NameException {
		if(age > 18) {
			System.out.println("Yor eligible to vote");
		}
		else {
			throw new NameException();
		}
	}
public static void main(String[] args) throws NameException {
	NameRunner nameRunner = new NameRunner();
	//nameRunner.method(2);
	
	Price price = new Price();
	price.method(2);
}
}

