class Lamp{
	
	String type;
	String brand;
	
	Lamp(String typeLocal, String brandLocal){
		
		type = typeLocal;
		brand = brandLocal;
		System.out.println("The type of the lamp is: "+type);
		System.out.println("The brand of the lamp is: "+brand);
		
	}
	
}

class LampRunner{
	
	public static void main(String[] args){
		
		Lamp lamp = new Lamp("LED", "Philips");
		Lamp lamp1 = new Lamp("Incandescent", "GE");
		Lamp lamp2 = new Lamp("Fluorescent", "IKEA");
		Lamp lamp3 = new Lamp("Halogen", "Osram");
		Lamp lmap4 = new Lamp("CFL", "Sylvania");
		Lamp lamp5 = new Lamp("Smart Lamps", "Cree");
		Lamp lamp6 = new Lamp("Solar Lamps", "Feit Electric");
		Lamp lamp7 = new Lamp("Tble Lamps", "Honeywell");
		Lamp lamp8 = new Lamp("Floor Lamp", "LIFX");
		Lamp lamp9 = new Lamp("Desk Lamp", "Havells");
		Lamp lamp10 = new Lamp("Himalayan Salt Lamps", "Wipro");
	}
	
}