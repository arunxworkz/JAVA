package com.xworkz.filesystem.addressreprository;

public class Git implements AddressRepository{

	@Override
	public boolean save() {
		System.out.println("Saving the file");
		return true;
	}

	@Override
	public int update() {
		System.out.println("The file is updated");
		return 1;
	}

	@Override
	public void delete() {
		System.out.println("The file is deleted");
		
	}

	@Override
	public String read() {
		System.out.println("The file is read");
		return "file";
	}

}
