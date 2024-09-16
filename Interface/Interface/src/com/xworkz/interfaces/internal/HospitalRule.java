package com.xworkz.interfaces.internal;

public interface HospitalRule {

	//long phNO;  error because the interface variables are by default final and static 
	//since it is final it has to be initiated.
	
	long phNo = 68431368732L;
	
	/*Interface methods are by default public abstract. The main difference 
	 * between the abstract and interface is, interface is not a class. Therefore it can 
	 * not be instantiated, however variables can be declared. 
	 * 
	 * interface uses implements keyword 
	 * class uses extends keyword*
	 * 
	 * 
	 * The methods in the interface is abstract by default/
	
	public void maintaicSilence();
	
	/*{
		interface methods an not have body
	}*/
	
	public void wearMaks();
	
	public void donotUsePhone();
	
}
