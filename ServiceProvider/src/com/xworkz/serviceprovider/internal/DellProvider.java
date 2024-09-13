package com.xworkz.serviceprovider.internal;

public class DellProvider extends Provider{

	public DellProvider(String name, String ceoName) {
		super(name, ceoName);
	}
	
	@Override
	public void service(String serviceName) {
		System.out.println("The sevice provided is: "+ serviceName);
	}

	/*public String toString() {
		System.out.println("Provider Name: " + name + ", CeoName: " + ceoName);
		return null;
	}*/
}
