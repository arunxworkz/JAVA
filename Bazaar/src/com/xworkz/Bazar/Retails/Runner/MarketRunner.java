package com.xworkz.Bazar.Retails.Runner;

import com.xworkz.Bazar.Retails.Market;
import com.xworkz.Bazar.Retails.OnlineMarket;
import com.xworkz.Bazar.Retails.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		SuperMarket superMarket = new SuperMarket();
		superMarket.parameter(null);
		
		System.out.println("====================================");
		
		Market market = new Market();
		superMarket.display();
		
		System.out.println("====================================");
		
		SuperMarket superMarket1 = new SuperMarket();
		Market market1 = new Market("name", "Electronics", null, 80);
		superMarket1.parameter(market1);
		
		System.out.println("====================================");
		
		OnlineMarket onlineMarket = new OnlineMarket();
		onlineMarket.local();
		
		System.out.println("====================================");
		
		SuperMarket superMarket3 = new SuperMarket();
		superMarket3.parameter(superMarket3);
		System.out.println("====================================");
		superMarket3.local();
	}
	
}
