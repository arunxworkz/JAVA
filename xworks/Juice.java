class Juice{
	
	public static void juiceInforpmation(String name, String brand, String flavor, double price,int quantity){
		System.out.println("NAme: "+name);
		System.out.println("Brand: "+brand);
		System.out.println("Flavor: "+flavor);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
	
	public static void main(String[] args){
		if(args.length != 4){
				String name = args[0];
				String brandname = args[1];
				String flavor = args[2];
				String price = args[3];
				String quantity = args[4];
				
				
				double cinprice = Double.parseDouble(price);
				int conquantity = Integer.parseInt(quantity);
		
				juiceInforpmation(name, brandname, flavor, cinprice, conquantity);

				
				
		}		
		else{
				  System.out.println("Provide exactly 5 arguments.");
		}
		 
		
	}	
	
}