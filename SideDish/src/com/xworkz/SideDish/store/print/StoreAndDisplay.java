package com.xworkz.SideDish.store.print;

import com.xworkz.SideDish.store.Dish;

public class StoreAndDisplay {
	
	private Dish[] dish = new Dish[5];
	private int i = 0;
	
	
	public void store(Dish dish) {
		this.dish[i] = dish;
		this.i++;
	}
	
	public void mudrana() {
		System.out.println("The dishes are: ");
		for(Dish dish: this.dish) {
			if(dish != null) {
				//System.out.println(dish);
				dish.show();
			}
			else {
				System.out.println("Nothis to print");
			}
		}
	}
	
}
