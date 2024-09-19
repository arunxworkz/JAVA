package com.xworkz.standards.working;

public class Operate implements Repository{

	@Override
	public boolean pull() {
		System.out.println("Pull the request");
		
		return true;
	}

}
