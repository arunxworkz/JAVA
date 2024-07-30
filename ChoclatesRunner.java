class Choclates{
	
	String name;
	String type;
	double weight;
	
	Choclates(String name, String type, double weight){
		
		name = name;
		type = type;
		weight = weight;
		
		System.out.println("The chocolate name is: "+name);
		System.out.println("The chocolate type is: "+type);
		System.out.println("The chocolate weight is: "+weight);
		
		
	}
}

class ChoclatesRunner{
	
		public static void main(String[] args){
			
			Choclates chocolate = new Choclates("Cadbury", "Creamy", 15.6);
			Choclates chocolate1 = new Choclates("Lindt", "milky", 10.78);
			Choclates chocolate2 = new Choclates("Ferrero", "Creamy", 15.97);
			Choclates chocolate3 = new Choclates("Hershey's", "milky", 5.26);
			Choclates chocolate4 = new Choclates("Nestlé", "Creamy", 79.23);
			Choclates chocolate5 = new Choclates("Mars", "milky", 15.26);
			Choclates chocolate6 = new Choclates("Ghirardelli", "Creamy", 13.56);
			Choclates chocolate7 = new Choclates("Godiva", "milky", 78.23);
			Choclates chocolate8 = new Choclates("Toblerone", "Creamy", 49.23);
			Choclates chocolate9 = new Choclates("Milka", "milky", 52.23);
			
		}
	
	
}