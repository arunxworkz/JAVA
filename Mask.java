class Mask{
	
	double cost;
	char size;
	String material;
	
	
	Mask(){
		System.out.println("NO parameters");
	}
	
	
	Mask(double cost){
		
		this.cost = cost;
		System.out.println("Constructor with one parameter of double data type: "+this.cost);
		
	}
	
	
	Mask(char size){
		
		this.size = size;
				System.out.println("Constructor with one parameter of char data type: "+this.size);

	}
	
	
	Mask(String material){
		
		this.material = material;
		System.out.println("Constructor with one parameter of string data type: "+this.material);
		
	}
	
	Mask(double cost, char size){
		
		this.cost = cost;
		this.size = size;
		System.out.println("The cost and the size is: "+this.cost+ " " +this.size);
		
	}
	
	Mask(double cost, String material){
		
		this.cost = cost; 
		this.material = material;
		System.out.println("The cost of the material is: "+this.cost+" "+this.material);
		
	}
	
	Mask(char size, String material){
		
		this.size = size; 
		this.material = material;
		System.out.println("The size and material is: "+this.size+" "+this.material);

	}
	
	Mask(String material, double cost, char size){
		
		this.material = material; 
		this.cost = cost; 
		this.size = size;
		System.out.println("The material used to produce the medium sized mask of size "+this.size+" is "+this.material+" "+this.cost);
		
	}
	
	
		public static void main(String[] args){
		
		Mask mask = new Mask(); 
		Mask mask1 = new Mask('S');
		Mask mask2 = new Mask(250.36);
		Mask mask3 = new Mask("Plastic");
		Mask mask4 = new Mask(236.9,'M');
		Mask mask5 = new Mask(500, "Fiber");
		Mask mask6 = new Mask('M', "Plastic");
		Mask mask7 = new Mask("Fabric", 500.369, 'M');
	
	
	
}

}


