interface Vehicle{
	void run();
}


/*class Use{
	void usage(Vehicle vehicle){
		if(vehicle != null){
			System.out.println("This is use class");
			vehicle.run();
		}
	}
}*/
class MainRunner1{
	public static void main(String[] args){
		Vehicle vehicle = () -> {
			System.out.println("This is functional interface");
		};
		vehicle.run();	
	//Vehicle vehicle	= new Vehicle();
	//Use use = new Use();
	//use.usage(vehicle);
	}
}