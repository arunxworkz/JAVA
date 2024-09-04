package com.xworkz.second;

import com.xworkz.first.SmartPhone;
import com.xworkz.practise.Choose;

public class Runner {
	
	public static void main(String[] args) {
		Choose choose= new Choose("Samsung M40", "Samsung", 15000, "Arun");
		
		choose.toPrintBrand();
		choose.getSmartPhone();
		choose.price();
		
		
		System.out.println("=========================================");
		
		SmartPhone smartPhone = new SmartPhone("Iphone 10", "Something", 2500000);
		//smartPhone.getSmartPhone(); this can not be done because it is protected in base class
		smartPhone.display();
		
	}
}
