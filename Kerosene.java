class Kerosene{
	
	double cost;
	int quality;
	int quantity;
	
	Kerosene(){
		System.out.println("This is no parameterised constructor");
	}
	
	
	Kerosene(double cost){
		this.cost = cost;
		System.out.println("The cost of kerosene is: "+this.cost);
	}
	
	
	Kerosene(int quality){
		
		this.quality = quality;
		System.out.println("The quality is: "+this.quality);
	}
	
	/*Kerosene(int quantity){
		this.quantity = quantity;
		System.out.println("The quantity is: "+this.quantity);
	}*    because a constructor with int data type as parameter is already defined inthe above constructor*/
	
	Kerosene(double cost, int quality, int quantity){
		this.cost = cost;
		this.quality = quality;
		this.quantity = quantity;
		System.out.println("The cost of kerosene for "+this.quantity+" of quality "+this.quality+" is "+this.cost);
	}
	
	Kerosene(double cost, int quality){
		this.cost = cost;
		this.quality = quality;
		System.out.println(this.cost+" "+this.quality);
	}
	
	Kerosene(int quality, int quantity){
		this.quality = quality;
		this.quantity = quantity;
		System.out.println(this.quality+" "+this.quantity);
	}
	
	
	public static void main(String[] args){
		
		Kerosene kerosene = new Kerosene();
		Kerosene kerosene1 = new Kerosene(56.35);
		Kerosene kerosene2 = new Kerosene(1);
		Kerosene kerosene3 = new Kerosene(2);
		Kerosene kerosene4 = new Kerosene(56.23, 1, 2);
		Kerosene kerosene5 = new Kerosene(52.36, 2);
		Kerosene kerosene6 = new Kerosene(2, 1);
		//Kerosene kerosene7 = new Kerosene();
		
		
		
	}
	
}