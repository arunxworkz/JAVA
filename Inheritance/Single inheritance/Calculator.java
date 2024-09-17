class Calculator{
	
	int noOfButtons;
	String capacity;
	String size = "small";
	
	public Calculator(int noOfButtons){
		this.noOfButtons = noOfButtons;
	}
	
	public void method(String capacity){
		this.capacity = capacity;
		System.out.println("Small calculator Capacity: "+capacity);
		System.out.println("Small calculator Size: "+size);
	}
	
	
	
	
}