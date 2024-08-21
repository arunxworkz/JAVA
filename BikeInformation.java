public class BikeInformation {
	
	private String bikearray[] = new String[7];
	private int i = 0;
	
	public void details(String bikeName) {
		
		
		/*for(int i = 0;i<=7; i++) {
			bikearray[i] = bikeName;
		}*/
		
		
		bikearray[i] = bikeName;
		i++;
		
		
	}
	
	
	public void display() {
		System.out.println("The bike name are: ");
		for(int i =0 ;i < bikearray.length;i++) {
			System.out.println("The bike name is: "+bikearray[i]);
		}
	}
	
	
}


class SewwtInformation{
	
	private String[] sweetName = new String[7];
	private int i = 0 ;
	
	void details(String name){
		
		sweetName[i] = name;
		i++;
		
	}
	
	void display(){
		System.out.println("The sweets are: ");	
		for(int i= 0;i< sweetName.length; i++){
			System.out.println("The sweet is: "+sweetName[i]);
		}
	}
}

class CityInformation{
	
	private String[] cityName = new String[7];
	private int i = 0;
	
	void information(String name){
		
		cityName[i] = name;
		i++;
		
	}
	
	void print(){
		
		for(int i = 0;i < cityName.length; i++){
			System.out.println("The city name is: "+cityName[i]);
		}
		
	}
		
	
}

class RiverInformation{
	
	private String[] riverName = new String[7];
	private int i = 0;

	void cityinformation(String name){
		riverName[i] = name;
		i++;
	}
	
	void mudrana(){
		
		for(String name: this.riverName){
			System.out.println("The river name is: "+name);
		}
		
	}
	
}


class DamInformation{
	
	String damInformation = new String[7];
	int i = 0;
	
	void details(String name){
		damInformation[i] = name;
		i++;
	}
	
	void print(){
		
		for(String name: this.damInformation){
			System.out.println("The dams name is: "+name);
		}
		
	}
	
	
	
	
}