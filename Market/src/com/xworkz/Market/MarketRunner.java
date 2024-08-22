package com.xworkz.Market;

import com.xworkz.Market.store.Market;
import com.xworkz.Market.store.show.Data;

public class MarketRunner {

	public static void main(String[] args) {
		
		Market m = new Market("Reliance", "Rajajinagara");
		Market m1 = new Market("Zudio", "Mejastic");
		Market m2 = new Market("More", "Yashwanthpura");
		
		Data d = new Data();
		
		d.store(m);
		d.store(m1);
		d.store(m2);
		d.display();
		
	}

}
