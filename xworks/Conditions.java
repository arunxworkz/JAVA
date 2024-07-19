class Conditions{
	
	public static String countryCodes(int code){
		if(code == 91){
			return "India";
		}
		
		if(code == 375){
			return "Belarus";
		}
		
		if(code == 229){
			return "Benin";
		}
		
		if(code == 387){
			return "Bosnia and Herzegovina";
		}
		
		if(code == 55){
			return "Brazi";
		}
		
		if(code == 242){
			return "Congo";
		}
		
		return "Nothing to return";
	}
	
	public static double price(String item){
		if(item == "chocolate"){
			return 50.3d;
		}
		
		if(item == "veggitables"){
			return 25.3d;
		}
		
		if(item == "apple"){
			return 100.50d;
		}
		
		if(item == "orange"){
			return 120.34d;
		}
		
		if(item == "milk"){
			return 24.2d;
		}
		
		return 0.000d;
	}
	
	public static String movie(String name){
		if(name == "Lagan"){
			return 	"Ashutosh Gowariker";
		}
		
		if(name == "Border "){
			return 	"J.P. Dutta";
		}
		
		
		if(name == "Uri"){
			return 	"Aditya Dhar";
		}
		
		if(name == "Lagan"){
			return 	"Ashutosh Gowariker";
		}
		
		if(name == "Manikarnika"){
			return 	"Radha Krishna";
		}
		
		return "Nothing to return";
	}
	
	
	public static void main(String[] args){
		System.out.println(countryCodes(375));
		
		double rate = price("chocolate");
		System.out.println(rate);
		
		String name = movie("Lagan");
		System.out.println(name);
	}

}