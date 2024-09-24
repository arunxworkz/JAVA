package com.xworkz.encapsulation.internal;

public class BankAccount {

	private long acc_no;
	private String accHolderName;
	private String acc_type;
	private String email;
	private Object bankAccount;
	
	public long getacc_no() {
		return acc_no;
	}
	
	public void setacc_no(long acc_no) {
		System.out.println("Account numbers: "+acc_no);
		this.acc_no = acc_no;	
	}
	
	public String getholderName() {
		return accHolderName;
	}
	
	public void setBankAccount(String accHolderName) {
		System.out.println("Account numbers: "+accHolderName);
		this.accHolderName = accHolderName;
	}
	
	public String getacc_type() {
		return acc_type;
	}
	
	public void setacc_type(String acc_type) {
		System.out.println("Account type: "+acc_type);
		this.acc_type = acc_type;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		System.out.println("Account numbers: "+email);
		this.email = email;
	}
	
}
