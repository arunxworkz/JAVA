public class Paint { 

    public static void company(String brand) {
        System.out.println("The brand is " + brand);
    } 

    public static void type(String brand, String color) {
        System.out.println("Brand and color are " + brand + " " + color);
    } 

    public static void price(String brand, float price) {
        System.out.println("The brand and price are " + brand + " " + price);
    } 

    public static void color(String color, String type, float price) {
        System.out.println("Color, type, and price are " + color + " " + type + " " + price);
    } 

	public static void sourceDestination(String source, String destination){
		System.out.println("The source and destination are "+source+" "+destination);
	}
	
	public static void quantity(String source, String destination, int quantity){
		System.out.println("The source, destination and quantity are "+source+" "+destination+" "+quantity);
	}	
	
	public static void priceOfTrainTicket(String source, String destination, int quantity, float price){
		System.out.println("The source, destination, quantity and price are "+source+" "+destination+" "+quantity+" "+price);
	}
	
	public static void cancle(int ticketNo){
		System.out.println("The ticket canacled is "+ticketNo);
	}
	
	public static void cancleSourceDestination(String source, String destination){
		System.out.println("The ticket is cancled between the source and destination is "+source+" "+destination);
	}
	
	
    public static void main(String[] args) {
        company("Asian Paints");
        type("Asian Paints", "red");
        price("Asian Paints", 45.6f);
        color("red", "cyan", 54.65f);
		
		sourceDestination("Bengaluru", "Chikkamagaluru");
		quantity("Bengaluru", "Chikkamagaluru", 2);
		priceOfTrainTicket("Bengaluru", "Chikkamagaluru", 2, 120.35f);
		cancle(123583);
		cancleSourceDestination("Bengaluru", "Chikkamagaluru");
    } 

}