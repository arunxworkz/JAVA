class Medicine{
	
	public static void medicalinfo(String name,long mafdate,float price,int quantity){
		System.out.println("Name: "+name);
		System.out.println("MAnufacture date: "+mafdate);
		System.out.println("Price: "+price);
		System.out.println("Quntity: "+quantity);
	}
	
	public static void main(String[] args){
		
		if(args.length == 4){
			String name = args[0];
			String manufacture = args[1];
			String price = args[2];
			String quantity = args[3];
			
			
			long conmanufacturedate = Long.parseLong(manufacture);
			float conprice = Float.parseFloat(price);
			int conquantity = Integer.parseInt(quantity);
			medicalinfo(name, conmanufacturedate, conprice, conquantity);
			
		}
		else{
			System.out.println("Provide atlrast 4 argument");
		}
		
	}
	
}