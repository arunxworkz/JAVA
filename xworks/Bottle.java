class Bottle{
	
	public static void store(){
		System.out.println("Stores the Water");
		full();
	}
	
	public static void empty(){
		System.out.println("Bottle is empty");
		half_empyty_half_full();
	}
	
	public static void full(){
		System.out.println("Bottle is full");
		store();
	}
	
	public static void half_empyty_half_full(){
		System.out.println("Bottle is half empty half full");
		full();
	}
	
}