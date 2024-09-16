package com.xworkz.interfaces.internal;

public class BankRules implements BankRule{

	public void fillFormsCorrectly() {
		System.out.println("Carefully fill the form");
	}
	
	public void waitForTokenNumber() {
		System.out.println("Follw thr token rules");
	}
	
	public void followDepositRules() {
		System.out.println("DEposite rules");
	}
	
	public void avoidCrowdingCounters() {
		System.out.println("Do not crowd on counter");
	}
	
	public void carryIdentityProof() {
		System.out.println("Carry ID proof");
	}
	
	public void maintainQueue() {
		System.out.println("Queue");
	}
}
