class 	Aeroplane{
	
	int noOfRegisters;
	String company;
	double ticketsPrice;
	String source;
    String destination;
	
	
	Aeroplane(){
		System.out.println("No parameter");
	}
	
	
	Aeroplane(int noOfRegisters, String company, double ticketsPrice, String source, String destination){
		
		this.noOfRegisters = noOfRegisters;
		this.company  = company;
		this.ticketsPrice = ticketsPrice;
		this.source = source;
		this.destination = destination;
		
		System.out.println("Number of registers: "+this.noOfRegisters);
		System.out.println("Name of company : "+this.company);
		System.out.println("Ticket ticketsPrice: "+this.ticketsPrice);
		System.out.println("Source: "+this.source);
		System.out.println("Destination: "+this.destination);
		System.out.println("=================================================");
	}
	
	Aeroplane(String company, String source, String destination){
		
		this.company = company;
		this.source = source;
		this.destination = destination;
		
		System.out.println("Company: "+this.company);
		System.out.println("Source: "+this.source);
		System.out.println("Destination: "+this.destination);
		System.out.println("=================================================");
		
		
	}
	
	
	Aeroplane(String source, String destination){
	
		this.source = source;
		this.destination = destination;
		System.out.println("The source is: "+this.source);
		System.out.println("the destination is: "+this.destination);
		System.out.println("=================================================");
		
	
	}
	
	Aeroplane(String source)
	{
		this.source = source;
		System.out.println("The source is: "+this.source);
		System.out.println("=================================================");
		
	}
	
	
	public static void main(String[] args){
		
		Aeroplane aeroplane = new Aeroplane(259, "TATA Airlines", 1200.365, "Banglore", "Ayodya");
		Aeroplane aeroplane1 = new Aeroplane("Boieng", "Shivamogga", "Banglore");
		Aeroplane aeroplane2 = new Aeroplane("Bengaluru", "Bombay");
		Aeroplane aeroplane3 = new Aeroplane("Bengaluru");
		//Aeroplane aeroplane = new Aeroplane();
		
		
		
	}
	
}