package com.xworkz.practise;

import com.xworkz.first.SmartPhone;

public class Choose extends SmartPhone{

	String ambasidor;
	public Choose(String name, String brand, double price, String ambasidor) {
		super(name, brand, price);
		this.ambasidor = ambasidor;
	}
	
	public void toPrintBrand() {
		System.out.println("The brand from sub classs is: "+brand);
	}
	
	@Override
	public void getSmartPhone() {
		/*super.brand="iphone";
		brand = "Samsung";*/
		System.out.println("The brand names is: "+brand+" and ambesiddro is: "+ambasidor+" "+super.brand);
	}
	
	@Override
	public void price() {
		System.out.println("The smart phone ambasidor is: "+ambasidor);
	}
	
	
}
