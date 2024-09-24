package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.internal.BankAccount;

public class AccountRunner {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setacc_no(454879316);
		bankAccount.setBankAccount("Arun");
		bankAccount.setacc_type("FB");
		bankAccount.setemail("arun@gmail.com");
		
	}
}
