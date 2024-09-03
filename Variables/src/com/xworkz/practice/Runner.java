package com.xworkz.practice;

import com.xworkz.internal.WildStone;
import com.xworkz.internal.WithoutExtend;

public class Runner {

	
	public static void main(String[] args) {
		WithoutExtend withoutExtend = new WithoutExtend();
		withoutExtend.method();
		withoutExtend.display();
		
		System.out.println("=============================================");
		
		WildStone wildStone = new WildStone();
		wildStone.display();
	}
}
