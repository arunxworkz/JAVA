package com.xworkz.string_methods.runner;

public class Runner {

	public static void main(String[] args) {
		
		//literal
		String object1 = "Space Station";
		String object2 = "Space Station";
		//new keyword
		String object3 = new String("Space Station");
		
		System.out.println("Literal string: "+object1);
		
		System.out.println("Useing new keyword: "+object3);
		
		/*The difference between the literal and the new keyword
		 * is, in  case of literal the variable will be pointing 
		 * to the default value before initilizing the value. Afet
		 * initilizing the value the value will be stired in the 
		 * constant pool and later the reference will be pointing
		 * to the address.It is memeory efficeient as java will use 
		 * same memory location.
		 * In acse of new keyword, a new memory instance will be created
		 * the variable will be pointing to that instance memory
		 * and data will be stored in that instance/.*/
		
		object1 = "Space";
		System.out.println(object2);
		//This will compapre the memory address in case of reassignment return true
		System.out.println(object1 == object1);
		//This also compare the memory address in case of reassignment return true
		System.out.println(object1.equals(object1));
		
		System.out.println("-----------------------------");
		
		//Comapre the address and returns false as 
		//the memory loaction is different
		System.out.println(object1 == object3);
		
		System.out.println("-----------------------------");
		
		String object4 = new String("Satallite");
		String object5 = new String("Satallite");
		
		//returns false as it comapre the memory location and both
		//the references are pointing to different loctaion. 
		System.out.println(object4==object5);
		
		System.out.println("-----------------------------");
		
		//Equals method comapres the content inside the refernce
		//and returns true as the content is same.
		System.out.println(object4.equals(object5));
		
		System.out.println("-----------------------------");
		
		Methods.methods();
		
	}

}
