package com.xworkz.senario.runner;

import com.xworkz.senario.internal.Animal;
import com.xworkz.senario.internal.Elephant;
import com.xworkz.senario.internal.Lion;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Animal animal;
		Lion lion = new Lion("Lion", 25);
		lion.getDiet("carnivorus");
		lion.makeSound();
		System.out.println(lion);
		
		System.out.println("-------------------------------");
		
		Elephant elephant = new Elephant("Elephant", 23);
		elephant.getDiet(null);
		elephant.makeSound();
		System.out.println(elephant);
		
	}
}
