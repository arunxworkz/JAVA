package cm.xworkz.Sweet.Tirunelveli;

public class Sweet {
	
	String type;
	double price;
	String place;
	
	public void store(String type, double price, String place) {
		this.type = type;
		this.price = price;
		this.place = place;
	}
	
	public void display() {
		System.out.println(place+" is famous for "+type+" sweet");
		System.out.println("The cost is: "+price);
	}
	
	
	
}
