package com.xworkz.funcinterface.monday;
import java.util.function.BiConsumer;

class Implementation{
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (a, b)->{
			System.out.println("The value is: "+ (a + b));
		};
		biConsumer.accept(82, 20);
	}
}
