class ScientificCalculator extends Calculator{
	
	int noOfButtons;
	String capacity;
	String size = "Big";
	
	public ScientificCalculator(int noOfButtons, String capacity){
		super(noOfButtons);
		this.capacity = capacity;
	}
	
	
	public void display(){
		System.out.println("Big calculator capacity: "+this.capacity);
		System.out.println("Big calculator size: "+this.size);
	}
	
	
}