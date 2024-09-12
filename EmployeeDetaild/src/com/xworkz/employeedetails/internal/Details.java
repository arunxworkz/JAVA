package com.xworkz.employeedetails.internal;

import java.util.Arrays;

public class Details {

	private String name;
	private String email;
	private int age;
	private long mobileNo;
	//private Details[] arr = new Details[5]; // dynamically it can be done using array list
	                                        //ArrayList<Details> list = new ArrayList<>();
	//private int index = 0;
	
	public Details(String name, String email, int age, long mobileNo) {
		super();             // if constructor become private then it can not be acces 
		                     // another class.
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		System.out.println("The name: "+name);
		System.out.println("The email: "+email);
		System.out.println("The age: "+age);
		System.out.println("The mobileNo: "+mobileNo);
		return null;
		//return "Name: "+name+"Email: "+email+"Age: "+age+"Mobile No: "+mobileNo;
	}
}	
