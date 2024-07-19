class Bus{
	
	public static void wheels(int noOfWheels){
		System.out.println("No of wheels are "+noOfWheels);
	}
	
	public static void driver(String name){
		System.out.println("Name of bus dreiver is "+name);
	}
	
	public static void ticketCOllector(String name){
		System.out.println("Name of ticket collector "+name);
	}
	
	public static void passangers(int noOfPassengers){
		System.out.println("No of passaengesrs per day "+noOfPassengers);
	}
	
	public static void stops(int noOfStops){
		System.out.println("No of Stops "+noOfStops);
	}
	
	public static void main(String[] args){
		wheels(8);
		driver("Aditya");
		ticketCOllector("Rohan");
		passangers(30000);
		stops(5);
	}
	
}