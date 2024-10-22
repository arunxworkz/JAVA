package com.xworkz.amazon.internal;

import com.xworkz.amazon.Car;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car();
	
		try {
			Class.forName("com.xworkz.internal.Runner");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
