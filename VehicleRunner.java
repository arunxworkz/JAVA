class Vehicle{
	
	String name;
	String type;
	String company;
	
	Vehicle(String nameLocal, String typeLocal, String companyLocal){
		
		name  = nameLocal;
		type = typeLocal;
		company = companyLocal;
		
		System.out.println("The name of the vehicle is: "+name);
		System.out.println("The type of the vehicle is: "+type);
		System.out.println("The company of the vehicle is: "+company);
		
		
		
	}
	
}


class VehicleRunner{
	
	public static void main(String[] args){
	
		Vehicle vehicle = new Vehicle("TVS Jupiter", "Two wheeler", "TVS");
		Vehicle vehicle1 = new Vehicle("Activa6G", "Two wheeler", "ACTIVA");
		Vehicle vehicle2 = new Vehicle("Tipper", "Heavy vehicle", "TATA");
		Vehicle vehicle3 = new Vehicle("BUS", "Public transport", "TATA");
		Vehicle vehicle4 = new Vehicle("XUV700", "Offroading four wheeler", "Mahindra");


	}
	
}