package com.xworkz.filesystem.runner;

import com.xworkz.filesystem.addressreprository.AddressRepository;
import com.xworkz.filesystem.addressreprository.Git;
import com.xworkz.filesystem.addressservice.Address;
import com.xworkz.filesystem.addressservice.Types;

public class Runner {

	public static void main(String[] args) {
		
		AddressRepository addressRepository = new Git();
		Git git = new Git(); /* this is because the Git class is implementing the 
		AddressRepository, and in git class using constructor the AddressRepository
		is being intilized hence there is an requirment of creating the git class
		instance*/
		
		//Address address = new Types(addressRepository);
		//address.push(addressRepository);
		
		Types types = new Types(git); 
		types.refresh(addressRepository);
		System.out.println("-----------------------------------");
		types.push(null);
		System.out.println("-----------------------------------");
		types.refresh(addressRepository);
		System.out.println("-----------------------------------");
		types.remove(addressRepository);
		System.out.println("-----------------------------------");
		types.load(addressRepository);
	}

}
