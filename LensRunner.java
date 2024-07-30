class Lens{
	
	double price;
	String brand;
	
	Lens(double price, String brand){
		
		price = price;
		brand = brand;
		System.out.println("The brand is: "+price);
		System.out.println("The price is: "+brand);
		
	}
	
}

class LensRunner{
	
	public static void main(String[] args){
		
			Lens lens = new Lens(5600, "Canon");
			Lens lens1 = new Lens(4000, "Nikon");
			Lens lens2 = new Lens(6000, "Sony");
			Lens lens3 = new Lens(5000, "Sigma");
			Lens lens4 = new Lens(4000, "Tamron");
			Lens lens5 = new Lens(4500, "Fujifilm");
			Lens lens6 = new Lens(3500, "Olympus");
			Lens lens7 = new Lens(9000, "Panasonic");
			Lens lens8 = new Lens(7600, "Tokina");
			Lens lens9 = new Lens(8500, "Zeiss");
	}
	
	
}