package com.xworkz.serviceprovider.internal;

public class BookingProvider extends Provider{

	public BookingProvider(String name, String ceoName) {
		super(name, ceoName);
	}
	
	@Override
	public void service(String sreviceNAme) {
		System.out.println("The sevice provider is: "+sreviceNAme);
	}
	
	public String toString() {
		System.out.println("Provider Name: " + name + ", ceoName: " + ceoName);
		return null;
	}
	
}
