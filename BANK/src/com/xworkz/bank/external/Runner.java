package com.xworkz.bank.external;

import com.xworkz.bank.internal.Account;

public class Runner {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(50000);
		
		account.setDeposite(40000);
		account.deposit();
		
		account.setWithDrad(1000);
		account.withDraw();
	}
	
	
}
