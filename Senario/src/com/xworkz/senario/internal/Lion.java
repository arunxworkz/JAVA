package com.xworkz.senario.internal;

public class Lion extends Animal{

	final String type = "carnivorus";
	public Lion(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public boolean getDiet(String type) {
		if(type != null) {
			if(type.equals(type)){
				System.out.println("Lion is a carniours animal");
				return true;
			}
			else {
				System.out.println("You are tryig to feed grass to lion");
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
		System.out.println("The lion will roar");
		
	}	
	
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}	
}
