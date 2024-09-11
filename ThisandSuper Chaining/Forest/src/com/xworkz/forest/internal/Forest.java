package com.xworkz.forest.internal;

public class Forest {

	String minister;
	int noOfSanctuary;
	String santuaryName; 
	String division;
	
	
	
	public Forest(String minister, int noOfSanctuary, String santuaryName, String division) {
		super();
		this.minister = minister;
		this.noOfSanctuary = noOfSanctuary;
		this.santuaryName = santuaryName;
		this.division = division;
	}

	


	public Forest(String santuaryName, String division) {
		super();
		this.santuaryName = santuaryName;
		this.division = division;
	}


	public void printing() {
		System.out.println("The Santuary is: "+santuaryName);
		System.out.println("The Division is: "+division);
	}


	@Override
	public String toString() {
		return "Forest: minister= " + minister + ", noOfSanctuary= " + noOfSanctuary + ", santuaryName= " + santuaryName
				+ ", division=" + division;
	}


	
	
	
}
