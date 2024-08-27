package com.xworkz.SamrtPhone;

import com.xworkz.SamrtPhone.phones.Phone;
import com.xworkz.SamrtPhone.phones.types.Brand;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brand bd =  new Brand();
		
		bd.store("Samsung M40", 15000, "Samsung", 250);
		bd.dispaly();
		
	}

}
