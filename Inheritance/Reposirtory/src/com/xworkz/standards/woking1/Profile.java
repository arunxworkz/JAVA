package com.xworkz.standards.woking1;

import com.xworkz.standards.working.Repository;

public class Profile implements Service{

	Repository repository; 
	
	public Profile(Repository repository) {
		this.repository = repository;
		System.out.println(repository);
	}
	
	@Override
	public String display() {
		System.out.println("Displays your work");
		return null;
	}
	
	
	public String check() {
		
		if(repository != null) {
			boolean pulled = repository.pull();
			if(pulled) {
				System.out.println("The request is pulled");
			}
			else {
				System.out.println("The request is not pulled");
			}
		}
		else {
			return null;
		}
		
		
		return null;
	}

}
