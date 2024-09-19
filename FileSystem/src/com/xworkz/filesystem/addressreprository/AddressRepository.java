package com.xworkz.filesystem.addressreprository;

public interface AddressRepository {

	boolean save();
	int update();
	void delete();
	String read();
	
	
}
