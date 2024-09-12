package com.xworkz.employeedetails.runner;

import com.xworkz.employeedetails.internal.DataStore;
import com.xworkz.employeedetails.internal.Details;

public class DetailsRunner {

	public static void main(String[] arrgs) {
		
		DataStore dataStore = new DataStore();
		
		Details details1 = new Details("Karthik", "karthik@gmail.com", 25, 7483079907L);
		dataStore.store(details1);
		
		
		//System.out.println("---------------------------------------------------------------");
		
		Details details2 = new Details("Naga", "nagu@gmail.com", 21, 384756872346l);
		dataStore.store(details2);
		
		
		//System.out.println("---------------------------------------------------------------");
		
		Details details3 = new Details("Pranav", "pranav@gmail.com", 20, 76975040023L);
		dataStore.store(details3);
		
		
		//System.out.println("---------------------------------------------------------------");
		
		Details details4 = new Details("Suresh", "suresh@gmail.com", 23, 3485628908l);
		dataStore.store(details4);
		
		
		//System.out.println("---------------------------------------------------------------");
		
		Details details5 = new Details("Ramesh", "ramesh@gmail.com", 24, 53485628908l);
		dataStore.store(details5);
		
		
		//System.out.println("---------------------------------------------------------------");
		
		Details details6 = new Details("Ramesh", "ramesh@gmail.com", 24, 53485628908l);
		dataStore.store(details6);
		
		dataStore.display();
		
	}
	
	
}
