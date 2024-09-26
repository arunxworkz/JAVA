package com.xworkz.encapsulation.runner;


import com.xworkz.encapsulation.internal.Area;
import com.xworkz.encapsulation.internal.BankAccount;
import com.xworkz.encapsulation.internal.City;
import com.xworkz.encapsulation.internal.Person;

public class AccountRunner {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setacc_no(454879316);
		bankAccount.getacc_no();
		bankAccount.setBankAccount("Arun");
		bankAccount.setacc_type("FB");
		bankAccount.setemail("arun@gmail.com");
		System.out.println("--------------------------------------------");
		
		Person person = new Person();
		person.run();
		person.work();
		
		System.out.println("--------------------------------------------");
		
		City city = new Area();
		city.Maleshwaram();
		city.Rajajinagara();
		
		
	}
}
