package com.xworkx.collectionmethod.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.xworkx.collectionmethod.internlal.EmailDTO;

public class EmailDTORunner {

	
	
	public static void main(String[] args) {
		
		EmailDTO emailDTO1 = new EmailDTO("Arun", "Rohith", "Time for call sheet");
		EmailDTO emailDTO2 = new EmailDTO("Pawan", "Pranav", "Meeting remainder");
		EmailDTO emailDTO3 = new EmailDTO("Karthik", "Rohan", "Invited for annula event");
		EmailDTO emailDTO4 = new EmailDTO("Prajval", "Kumar", "pleased to offer you the position of Software Engineer");
		EmailDTO emailDTO5 = new EmailDTO("Dhoni", "Virat", "Latest update on the project status");
		
		
		Collection<EmailDTO> collection = new ArrayList<>();
		
		collection.add(emailDTO1);
		collection.add(emailDTO2);
		collection.add(emailDTO3);
		collection.add(emailDTO4);
		collection.add(emailDTO5);
		
		collection.forEach(ref->System.out.println(ref));
		
		System.out.println("------------------------------------------------------------");
		
		Collection<EmailDTO> collection1 = new ArrayList<>();
		
		EmailDTO emailDTO6 = new EmailDTO("Komal", "Jaggesh", "Don't forget about our meeting tomorrow at 10 AM");
		EmailDTO emailDTO7 = new EmailDTO("Keshav", "Karan", "Meeting remainder");
		EmailDTO emailDTO8 = new EmailDTO("Rahul", "Karan", "Report about the Project");
		EmailDTO emailDTO9 = new EmailDTO("Suresh", "Salman", "Following up on our previous conversation regarding the contract");
		EmailDTO emailDTO10 = new EmailDTO("Keshav", "Narayan	", "Board mettiing");
		
		collection1.add(emailDTO6);
		collection1.add(emailDTO7);
		collection1.add(emailDTO8);
		collection1.add(emailDTO9);
		collection1.add(emailDTO10);
		
		/*addAll method is used to add elements of ine collection object into another*/
		collection.addAll(collection1);
		
		collection.forEach(ref->System.out.println(ref));
		
		System.out.println("------------------------------------------------------------");
		
		EmailDTO emailDTO11 = null;
		System.out.println(collection.contains(emailDTO11));
		System.out.println("------------------------------------------------------------");
		System.out.println(collection.containsAll(collection));
		System.out.println("------------------------------------------------------------");
		
		//true if the specified object is equal to this collection
		
		EmailDTO emailDTO12 = new EmailDTO("Komal", "Jaggesh", "Don't forget about our meeting tomorrow at 10 AM");
		EmailDTO emailDTO13 = new EmailDTO("Keshav", "Karan", "Meeting remainder");
		EmailDTO emailDTO14 = new EmailDTO("Rahul", "Karan", "Report about the Project");
		EmailDTO emailDTO15 = new EmailDTO("Suresh", "Salman", "Following up on our previous conversation regarding the contract");
		EmailDTO emailDTO16 = new EmailDTO("Keshav", "Narayan	", "Board mettiing");
		
		Collection<EmailDTO> collection2 = new ArrayList<EmailDTO>();
		
		collection2.add(emailDTO12);
		collection2.add(emailDTO13);
		collection2.add(emailDTO14);
		collection2.add(emailDTO15);
		collection2.add(emailDTO16);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(collection2.isEmpty());
		
		System.out.println(collection.size());
		
		System.out.println("--------------------------------------------------------");
		
		//System.out.println(collection.toArray());
		
		System.out.println("--------------------------------------------------------");
		
		collection.remove(emailDTO2);
		collection.forEach(ref->System.out.println(ref));
		
		System.out.println("--------------------------------------------------------");		

		collection.removeAll(collection1);
		collection.forEach(ref->System.out.println(ref));
		
		System.out.println("--------------------------------------------------------");		

		collection2.removeIf(ref->!(ref instanceof EmailDTO));	
		collection2.forEach(ref->System.out.println(ref));
		System.out.println(collection2.size());
		/*collection.clear();
		System.out.println(collection.isEmpty());*/
		
		
		
	}
}
