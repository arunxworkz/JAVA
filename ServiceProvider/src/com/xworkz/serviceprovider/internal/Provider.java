package com.xworkz.serviceprovider.internal;

public abstract class Provider {

	String name;
	String ceoName;
	
	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
	}

	@Override
	public String toString() {
		System.out.println("Provider name: " + name + ", CeoName: " + ceoName);
		return null;
	}
	
	public abstract void service(String sreviceNAme);
	
	
	
	
	
}
