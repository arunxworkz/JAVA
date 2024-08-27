package cm.xworkz.Sweet.Tirunelveli.Tamilndu;

import cm.xworkz.Sweet.Tirunelveli.Sweet;

public class SweetNames extends Sweet{
	
	/*public SweetNames() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
	String mainIngredient;
	
	public void ingredient(String name){
		this.mainIngredient = name;
		System.out.println("The main Ingredient of the sweet is:"+ mainIngredient);
	}

}
