class AirConditiner{
	double price;
	String brand;
	int levelOfTemparature;
	
	AirConditiner(){
			System.out.println("The Price is: "+price);
			System.out.println("The Brand is: "+brand);
			System.out.println("The Level of temperatutre tha AC can raech is: "+levelOfTemparature);
			System.out.println("================================================");
	}
	
}

class AutoRiksha{
		String driverName;
		double meterPrice;
		String chasiNumber;
		int noofPassangers;
	
	AutoRiksha(){
		System.out.println("The Driver name is: "+driverName);
		System.out.println("The meter price is: "+meterPrice);
		System.out.println("The number of passangers per day is: "+noofPassangers);
		System.out.println("The chasi number of auto is: "+chasiNumber);
			System.out.println("================================================");
		
	}
	
}

class Rapido{
	
		String typeOfVehicel;
		int noOfWheels;
		String pickUpLocation;
		String dropLocation;
		
	Rapido(){
		System.out.println("The type of vehicle is: "+typeOfVehicel);
		System.out.println("The number of wheels of a vehicle is: "+noOfWheels);
		System.out.println("The pick up location of of a passanger is: "+pickUpLocation);
		System.out.println("Drop locations will vary acordingy is: "+dropLocation);
		System.out.println("================================================");
		
	}
	
}

class CabCompany{
		String name;
		int noOfEmployees;
		String location;
		int noOfVehicleHeired;
	CabCompany(){
		System.out.println("The name of cab company is: "+name);
		System.out.println("The number of employees in a company is: "+noOfEmployees);
		System.out.println("The location of company is: "+location);
		System.out.println("Number of vehicle heired per day is: "+noOfVehicleHeired);
		System.out.println("================================================");
		
	}

}

class BMTC{
		
	int noOfEmplyess;
	String locations;
	double maintainanceCost;
	BMTC(){	
		System.out.println("The number of employees in BMTC is: "+noOfEmplyess);
		System.out.println("The location of head quaters is: "+locations);
		System.out.println("The maintainance cost  is: "+maintainanceCost);
		System.out.println("================================================");
		
	}
}

class FoodDeliveryCompany{
	String companyName;
		int noOfEmployees;
		int noOfHotelsRegistered;

	FoodDeliveryCompany(){
		System.out.println("The name of the company is: "+companyName);
		System.out.println("The noOfEmployees are: "+noOfEmployees);
		System.out.println("The number if hotels Regidtereg is: "+noOfHotelsRegistered);
		System.out.println("================================================");
		
	}
	
}

class allclasses{
	public static void main(String[] args){
		AirConditiner airConditioner = new AirConditiner();
		AutoRiksha autoRiksha = new AutoRiksha();
		Rapido rapodo = new Rapido();
		CabCompany cabCompany = new CabCompany();
		BMTC bmtc = new BMTC();
		FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
	}
}


