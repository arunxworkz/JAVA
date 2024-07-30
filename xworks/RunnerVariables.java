class Matrimony{
	
	int noOfRegisters;
	int noOfMale;
	int noOfFemale;
	
	
	Matrimony(){
		
	}
	
	
}

class Application{
	
	double price;
	String name;
	String size;
	
	Application(){
	System.out.println("Ths is application constructor");
	
	}
}

class Fruits{
	
	String nameOfFruit;
	double priceOfFruit;
	
	Fruits(String nameOfFruit, double priceOfFruit){
		this.nameOfFruit = nameOfFruit;
		this.priceOfFruit = priceOfFruit;
		System.out.println("The price of "+nameOfFruit+" is "+priceOfFruit+" per Kg");
	}
}

class Juic{
	
	
	Strign name;
	double price;
	
	juice(){
		System.ou/t.rpitnln("this is juicce constructor");
	}
}

class Palace{
	String name;
	String palacePlace;
	int visiting_charde  = 10;
	
	Palace(){
		
	}
}

class AlcoholBrand{
	
	dounblu price = 1234.45;
	String name;
	double cost;
	AlcoholBrand(){
		
	}
}

class Food{
	
	String personname = "Arun";
	String name;
	double price;
	String hotelName;
}

class RunnerVariables{
	public static void main(String[] agrs){
		
		Matrimony matrimony = new Matrimony();
		matrimony.noOfRegisters = 1002;
		matrimony.noOfMale = 700;
		matrimony.noOfFemale = 402;
		System.out.println("The number of registers is: "+matrimony.noOfRegisters);
		System.out.println("The number of registers is: "+matrimony.noOfMale);
		System.out.println("The number of registers is: "+matrimony.noOfFemale);
		System.out.println("The number of registers is: "+matrimony.personname);
		
		Application application = new Application();
		application.price = 560.25;
		application.name = "";
		application.size = "25MB";
		String size = application.size;
		System.out.println("The price of the application is: "+application.price);
		System.out.println("The name of the applocation is:" + application.size);
		System.out.println("The size of the application is is: "+size);
		
		Fruits fruit = new Fruits();
		fruit.nameOfFruit = "apple";
		friut.priceOfFruit = 250.5;
		System.out.println("The name of fruit is: "+fruit.nameOfFruit);
		System.out.println("The price is: "+fruit.priceOfFruit);
		
		Juice juice = new Juice();
		juice.name = "Orange";
		juice.price = 25.26;
		System.out.println("The name of juice is: "+juice.name);
		System.out.println("The price is: "+juice.price);
		
		Palace palace = new Palace();
		palace.name = "Amba Vilas";
		palace.placePalace = "Mysore";
		System.out.println("The name of palace is: "+palace.name);
		System.out.println("The place is: "+palace.placePalace);
		
		AlcoholBrand alcoholbrand = new AlcoholBrand();
		alcoholbrand.name = "King Fisher";
		alcoholbrand.price = 5000.709;
		System.out.println("the name: "+alcoholbrand.name);
		System.out.println("the "+alcoholbrand.price);
		
		Food food = new Food();
		food.name = "Karabath";
		foor.price = 52.36;
		food.hotelName = "Hotel Sagar";
		System.out.println("the name of food is: "+food.name);
		System.out.println("the price of the ffosd is: "+food.price);
		system.out.println("the hotelname is: "+food.hotelName);
		
	}
}