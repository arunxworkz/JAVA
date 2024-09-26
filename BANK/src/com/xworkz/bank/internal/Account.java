package com.xworkz.bank.internal;

public class Account extends BankAccount{

	private int balance = 0;
	private int deposite;
	private int withDraw;
	private int noOfTranscation = 0;
	
	public int getBalance() {
		return balance;
	}
	
	public int setBalance(int balance) {
		return this.balance = balance;
	}
	
	
	public int getDeposite() {
		return deposite;
	}
	
	public int setDeposite(int deposite) {
		return this.deposite = deposite;
	}
	
	@Override
	public int getWithDrad() {
		return withDraw;
	}

	@Override
	public int setWithDrad(int withDraw) {
		return this.withDraw = withDraw;
	}
	
	
	@Override
	public void deposit() {
		if(balance == 0) {
			balance = deposite + balance;
			System.out.println("The balanacce is: "+balance);
			noOfTranscation++;
			System.out.println("The number of transcation done is: "+noOfTranscation++);
		}
		else {
			balance = deposite + balance;
			System.out.println("The balance is: "+balance);
			noOfTranscation++;
			System.out.println("The number of transcation done is: "+noOfTranscation++);
		}
		
	}

	@Override
	public void withDraw() {
		 if (withDraw > balance) {
	            System.out.println("Insufficient balance.");
	            return;   
		 }
		if(withDraw >= 10000) {
			System.out.println("Permision is required");
		}
		else {
			int withDrawAmmount = withDraw;
			balance = balance - withDrawAmmount;
			System.out.println("The mount withdrawed is: "+withDraw);
			System.out.println("Remaining balance is: "+balance);
			System.out.println("The number of transcation done is: "+noOfTranscation++);
		}
		
	}


}
