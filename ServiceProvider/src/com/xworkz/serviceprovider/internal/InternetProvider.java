package com.xworkz.serviceprovider.internal;

public class InternetProvider extends Provider{

	//private static String ceoName;
	
	
	
	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
		//System.out.println("");
	}
	
	public void service(String sreviceNAme) {
		System.out.println("The sevice provider is: "+name+" "+ ceoName);
	}
	
	
}
