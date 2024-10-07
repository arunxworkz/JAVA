//Interface example
interface Vehicle{
	public void run();
}


class Car implements Vehicle{
	public void run(){
			System.out.println("This is Car implementation");

			System.out.println("Check the reference");
		
	}
}

class Use{
	//Vehicle vehicle;
	public void usage(Vehicle vehicle){
		if(vehicle != null){
			vehicle.run();
		}else{
			System.out.println("Check the reference");
		}
	}
}

class InterfaceRunner{
	public static void main(String[] args){
		Vehicle vehicle = new Car();
		Use use = new Use();
		use.usage(null);
	}
}