package com.zworkz.projects.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

import com.zworkz.projects.dto.HrDTO;

public class Runner {

	public static void main(String[] args) {
		
		
		Collection<HrDTO> collection = new ArrayList<HrDTO>();	
		
		collection.add(new HrDTO("arun", "arun30@gmail.com", "Rajajinagara", 5, "B.E"));
		collection.add(new HrDTO("sachine", "sachine@gmail.com", "Sadshivnagara", 6, "MTech"));
		collection.add(new HrDTO("priya", "priya25@gmail.com", "Koramangala", 4, "MBA"));
		collection.add(new HrDTO("raj", "raj12@gmail.com", "Indiranagar", 7, "B.Tech"));
		collection.add(new HrDTO("neha", "neha98@gmail.com", "Malleshwaram", 3, "MCA"));
		collection.add(new HrDTO("kumar", "kumar56@gmail.com", "Whitefield", 9, "BSc"));
		collection.add(new HrDTO("ravi", "ravi78@gmail.com", "Banashankari", 8, "B.Com"));
		
		
		collection.stream().forEach(ref -> System.out.println(ref.getLocation()));
		collection.stream().filter((ref)->ref.getExperience()>5).forEach(ref->System.out.println(ref));
		collection.stream().filter((ref)->ref.getName().endsWith("r")).forEach(ref->System.out.println(ref));
		collection.stream().forEach(ref->System.out.println(ref.getLocation()));
		
		collection.stream().sorted((ref1, ref2)->ref1.getName().compareTo(ref2.getName()));
		collection.stream().sorted((ref1, ref2)->ref1.getQulification().compareTo(ref2.getQulification()));
		
		collection.stream().sorted((ref1, ref2)->Double.compare(ref2.getExperience(), ref1.getExperience()));
		
		Iterator<HrDTO> iterator = collection.iterator();
		while(iterator.hasNext()) {
			HrDTO ref = iterator.next();
			if(ref.getName().startsWith("a"))
				System.out.println(ref);
		}
		
		
		
	}
	
	
}
