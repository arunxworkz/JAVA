package com.xworkz.equals.runner;

import com.xworkz.equals.internal.Companies;
import com.xworkz.equals.internal.ProductBased;

public class Runner {

	public static void main(String[] args) {
		
		Companies companies = new Companies("Adobe", 250, "Shantanu Narayen");
		ProductBased productBased = new ProductBased("Adobe", 250,"Narayen");
		
		productBased.equals(productBased);
		productBased.equals(companies);
		System.out.println("---------------------------------");
		
		ProductBased productBased1 = new ProductBased("Amazon", 250,"Andy");
		Companies companies1 = new ProductBased("Adobe", 250,"Arun");
		Companies companies12 = new Companies("Adobe", 250,"Andy");
		productBased1.equals(companies12);
		productBased1.equals(companies1);
		
		//child refernce can not point to parent, but parent can.
		//ProductBased productBased = new Companies("Adobe", 250,"Narayen");
		
		System.out.println("---------------------------------");
		
		ProductBased pd = new ProductBased("Google", 2500,"Sundar");
		Companies companies13 = new Companies("Adobe", 2500,"Andy");
		pd.equals(companies13); // comapring itselef, it will always return true
		/*the above will not work, it always return false even we are checking the 
		 * same value s because,
		 * we are comparing two objects of 2 classes, in one if condition we are checking 
		 * ceo name and in other we are cheacking noOfEmployee, however we have to compare 
		 * both as below*/
		System.out.println("---------------------------------");
		ProductBased pd1 = new ProductBased("Google", 2500,"Sundar");
		Companies companies14 = new Companies("Adobe", 2500,"Sundar");
		pd1.equals(companies14);  // this will return true
		companies14.toString();
		pd1.toString();
		System.out.println("---------------------------------");
		Companies c12 = new ProductBased("Apple", 2400, "Tim");
		ProductBased pd10 = new ProductBased("Apple", 240, "Lim");
		pd10.equals(c12);
		
	}

}