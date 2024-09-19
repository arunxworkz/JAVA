package com.xworkz.filesystem.addressservice;

import com.xworkz.filesystem.addressreprository.AddressRepository;

public interface Address {
	
	boolean push(AddressRepository addressRepository);
	int refresh(AddressRepository addressRepository);
	void remove(AddressRepository addressRepository);
	String load(AddressRepository addressRepository);
	
}
