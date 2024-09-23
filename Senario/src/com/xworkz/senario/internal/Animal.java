package com.xworkz.senario.internal;

public class Animal {

	String name;
	int age;
	String type;
	
	public void makeSound() {
		System.out.println("This is animal class");
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}	
	
	
}
