package com.xworkz.Bazar.Retails;

public class SuperMarket extends Market{

	public void parameter(Market market) {
		
		if(market != null) {
			market.display();
		}
		else {
			System.out.println("Check the pointer");
		}
		
	}
	
	
	public void local() {
		Market market = new Market();
		
		Market market1 = new Market("Reliance", null, "Rajajinagara",80);
		
		market.method();
		market1.display();
		
		
	}
	
	
}
