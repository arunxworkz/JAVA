package com.xworkz.Market;

import com.xworkz.Market.store.Market;
import com.xworkz.Market.store.show.Data;

public class MarketRunner {

	public static void main(String[] args) {
		
		Market m = new Market("Reliance", "Rajajinagara");
		
		Data d = new Data();
		
		d.store(m);
		d.display();
		
	}

}
