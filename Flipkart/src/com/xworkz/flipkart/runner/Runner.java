package com.xworkz.flipkart.runner;

import com.xworkz.flipkart.internal.Bus;

public class Runner {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		try {
			Class.forName("com.xworkz.flipkart.internal.Bus");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("This is exception block");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
