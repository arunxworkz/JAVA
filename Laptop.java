class Laptop{
	
	
	int mousePrice = 1000;
	int laptopPriceHp = 50000;
	int laptopPriceDell = 60000;
	int laptopPriceAcer = 70000;
	
	int keyboardPrice = 1500;
	//int totalPrice;
	String laptop;
	
	
	
	int calculate(String laptop, boolean offer){
		
		
		//int laptopPrice = 50000;
		//int laptopPrice = 0;
		int totalprice = 0;
		
		if(laptop == "HP"){
			
			
			if(offer == true){
			//int laptopPrice = 50000;
			totalprice = laptopPriceHp - keyboardPrice - mousePrice;
			return totalprice;
			}
			else{
				totalprice=laptopPriceHp;			
				return totalprice;
			}
		}
		
		/*else{
			return 0;
		}*/
		
		else if(laptop == "Dell"){
		
			//int laptopPrice = 60000;
			if(offer == true){
			totalprice = laptopPriceDell - keyboardPrice - mousePrice;
			System.out.println("The laptop cost of "+laptop+" is "+totalprice);
			return totalprice;
			}
			else{
				totalprice = laptopPriceDell;
				return totalprice;
			}
		}
		
		/*else{
			return 0;
		}*/
		
		
		else if(laptop == "Acer"){
			//int laptopPrice = 70000;
			if(offer == true){
			totalprice = laptopPriceAcer - mousePrice - keyboardPrice;
			System.out.println("The total price for the "+laptop+" is "+totalprice);
			return totalprice;
			}
		
		else{
			totalprice = laptopPriceAcer;
			return totalprice;
		}
		
		
		
	}	
	
		else{
			return 0;
		}
		
		
		/*else if(offer == true && laptop == "Asus"){
			int laptopPrice = 
		}*/
		

		
}

}
	
	
	
	
	
	
