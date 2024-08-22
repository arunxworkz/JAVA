package com.xworkz.Dish;

import com.xworkz.SideDish.store.Dish;
import com.xworkz.SideDish.store.print.StoreAndDisplay;

public class DishRunner {

	public static void main(String[] args) {
		
		Dish ad = new Dish("Gobi manhuri", 40.0);
		Dish ad1 = new Dish("Dry Gobi", 50.0);
		Dish ad2 = new Dish("Chakana", 20.0);
		Dish ad3 = new Dish("Pickles", 25.0);
		
		StoreAndDisplay sad = new StoreAndDisplay();
		
		sad.store(ad);
		sad.store(ad1);
		sad.store(ad2);
		sad.store(ad3);
		sad.mudrana();
		
	}

}
