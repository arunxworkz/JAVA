package com.xworkz.finalkeyword.runner;

import com.xworkz.finalkeyword.internal.Human;
import com.xworkz.finalkeyword.internal.Male;

public class Runner {

	public static void main(String[] args) {
		
		
		Human human = new Human((int)5.7, 56, "Male");
		human.method(); // final method can be used but can not be over ridden
		human.printing();
		
		System.out.println("------------------------------------------------");
		
		Male male = new Male(0, 6, "Male");
		male.display();
	}

}
