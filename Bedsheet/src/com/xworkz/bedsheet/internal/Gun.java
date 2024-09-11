package com.xworkz.bedsheet.internal;

public class Gun {

	String name;
	String type;
	int noOfRounds;
	
	public Gun(String name, String type, int noOfRounds) {
		super();
		this.name = name;
		this.type = type;
		this.noOfRounds = noOfRounds;
	}

	@Override
	public String toString() {
		return "Gun [name=" + name + ", type=" + type + ", noOfRounds=" + noOfRounds + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Gun) {
				Gun casted = (Gun) obj;
				if(casted.type.equals(this.type) && casted.noOfRounds == this.noOfRounds) {
					System.out.println("Information are equal");
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
}
	
	
	

