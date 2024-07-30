class SmartPhone{
	
	double price;
	String company;
	String simcard;
	
	
	SmartPhone(String companyLocal, double priceLocal, String simacrdLocal){
		
		company = companyLocal;
		price = priceLocal;
		simcard = simacrdLocal;
		
		System.out.println("The company of the phone purshaded is: "+company);
		System.out.println("The price of the phone is: "+company);
		System.out.println("The sim card inserted in the phone is: "+simcard);
		
	}
	
	
}

class SmartPhoneRunner{
	
	public static void main(String[] args){
		
		SmartPhone smartPhone = new SmartPhone("Micromax", 10000, "BSNL"); 
		SmartPhone smartPhone1 = new SmartPhone("Samsumg M40", 15500, "Jio");
		SmartPhone smartPhone2 = new SmartPhone("Samsung S24", 100000, "Airtel"); 
		SmartPhone smartPhone3 = new SmartPhone("Samsung A22", 25000, "Jio"); 
		SmartPhone smartPhone4 = new SmartPhone("Nokia", 20000, "BSNL"); 
		SmartPhone smartPhone5 = new SmartPhone("VIVO", 15000, "Idea"); 
		SmartPhone smartPhone6 = new SmartPhone("Xiaomi", 23000, "Docomo"); 
		SmartPhone smartPhone7 = new SmartPhone("Oppo F27", 40000, "Airtel"); 
		SmartPhone smartPhone8 = new SmartPhone("Motorola", 30000, "Jio"); 
		SmartPhone smartPhone9 = new SmartPhone("Oneplus", 50000, "Idea"); 
		SmartPhone smartPhone10 = new SmartPhone("Apple", 150000, "Jio"); 
		
		
		
	}
	
	
	
}