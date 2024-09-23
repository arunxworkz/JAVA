package com.xworkz.senario.internal;

public class Elephant extends Animal{

	final String type = "herbiours";
	public Elephant(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public boolean getDiet(String type) {
		if(type != null) {
			if(type.equals(type)){
				System.out.println("Elephant is a "+ type +" animal");
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println("Type is null");
			return false;
		}
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Elephnt is Trumpting");
	}
	
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}	
}
