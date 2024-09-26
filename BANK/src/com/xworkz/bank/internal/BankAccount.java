package com.xworkz.bank.internal;

public abstract class BankAccount {

	public abstract int getBalance();
	public abstract int setBalance(int balance);
	public abstract int getDeposite();
	public abstract int setDeposite(int deposite);
	public abstract int getWithDrad();
	public abstract int setWithDrad(int withDraw);
	public abstract void deposit();
	public abstract void withDraw();
	
	
}
