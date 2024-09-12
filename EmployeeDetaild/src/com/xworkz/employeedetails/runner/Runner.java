package com.xworkz.employeedetails.runner;

import com.xworkz.employeedetails.internal.Details;

/*hHere the problem is the array will be keep on accepting the details, as each is instance 
 * creating its own array of size 5. Therefore to overcome this we need to create new class 
 * consisting of array which will be shared by all the instances.*/



public class Runner {

	public static void main(String[] args) {
		
		Details details1 = new Details("Karthik", "karthik@gmail.com", 25, 7483079907L);
		details1.store(details1);
		details1.display();
	
		System.out.println("---------------------------------------------------------------");
		
		Details details2 = new Details("Naga", "nagu@gmail.com", 21, 384756872346l);
		details2.store(details2);
		details2.display();
		
		System.out.println("---------------------------------------------------------------");
		
		Details details3 = new Details("Pranav", "pranav@gmail.com", 20, 76975040023L);
		details3.store(details3);
		details3.display();
		
		System.out.println("---------------------------------------------------------------");
		
		Details details4 = new Details("Suresh", "suresh@gmail.com", 23, 3485628908l);
		details4.store(details4);
		details4 .display();
		
		System.out.println("---------------------------------------------------------------");
		
		Details details5 = new Details("Ramesh", "ramesh@gmail.com", 24, 53485628908l);
		details5.store(details5);
		details5.display();
		
		System.out.println("---------------------------------------------------------------");
		
		Details details6 = new Details("Gansham", "gansham@gmail.com", 22, 53488908l);
		details6.store(details6);
		details6.display();
		
		
		Details details7 = new Details("Gansham", "gansham@gmail.com", 22, 53488908l);
		details7.store(details7);
		details7.display();
	}
	
	
	
}
