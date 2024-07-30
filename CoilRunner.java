class Coil{
	
	String type;
	double cost;
	
	Coil(String type, double cost){
		
		type = type;
		cost = cost;
		
		System.out.println("The type of coil: "+type);
		System.out.println("The cost of coil: "+cost);
		
	}
}

class CoilRunner{
	
	
	public static void main(String[] args){
		
		Coil coil = new Coil("Aluminum", 80000);
		Coil coil1 = new Coil("Brass", 40000);
		Coil coil2 = new Coil("Nickel", 80000);
		Coil coil3 = new Coil("Zinc", 50000);
		Coil coil4 = new Coil("Carbon steel", 70000);
		Coil coil5 = new Coil("Patinum", 1000000);
		Coil coil6 = new Coil("Bronz", 80000);
		Coil coil7 = new Coil("Silver", 90000);
		Coil coil8 = new Coil("Gold", 100000);
		Coil coil9 = new Coil("Mosquito", 50);
		Coil coil10 = new Coil("Copper", 90000);
	}
	
}