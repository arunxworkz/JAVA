import java.util.HashMap;
import java.util.Scanner;

class CurrencyConverter{
	
	public static void main(String[] args){
		
		HashMap<String, Double> map = new HashMap<>();
		 
		/*Here hasmap in java does not support primitive data types
		like int, double , flot, etc. Therefore here we can not use 'double'
		data type insted use 'Double'. 
		
		Along with  this the data for Double should be in decimal manner
		example 82.23 0r 82.0
		The error could be -  method Map.put(String,Double) is not applicable
		(argument mismatch; int cannot be converted to Double)*/
		
		map.put("US", 83.0);
		map.put("AUS", 54.0);
		map.put("JPY", 0.52);
		map.put("GPB", 104.0);
		map.put("ADU", 54.0);
		map.put("CAD", 62.0);
		
		Double convertedAmmount = 0.0;
		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amout to be converted: ");
		Double price = sc.nextDouble();
		
		sc.nextLine(); // pending
		
		System.out.print("Enter the currency: ");
		String currency = sc.nextLine();
		
		/* for(String key : map.keySet()){ For loop is also ok, however it will give unwanted looping
			Double value = map.get(key); 
			
			gere insted of using for we can directly use if condition, 
			by avoiding unwanted messages*/
			
		if(map.containsKey(currency)){ //containsKey is inbuilt method in java for hashmap
			convertedAmmount = price * map.get(currency); // get is also inbuilt method
			System.out.println("Tht converted maoount is: "+convertedAmmount);
		}
		else{
			System.out.println("No currency found");	
		}	
	}
}