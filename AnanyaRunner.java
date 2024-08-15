class AnanyaRunner{
	
	
	public static void main(String[] hdv){
		
		Knief knief = new Knief(20, 5.6);
		Ananya ananya = new Ananya("MicroMax", knief);
		
		Knief knief1 = new Knief(15, 2.6);
		Ananya ananya1 = new Ananya("Samsung", knief1);
		
		Ananya ananya2 = new Ananya("Samsung S24", null);
		
		ananya.display();
		System.out.println("==============================");
		ananya1.display();
		System.out.println("==============================");
		ananya2.display();
		
	}
	
	
	
}