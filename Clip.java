class Clip{
	
	String color;
	String type;
	
	Clip(String color, String type){
		
		this.color = color;
		this.type = type;
		
		
	}
	
	void display(){
		
		System.out.println("The clip color is: "+this.color);
		System.out.println("The clip type is: "+this.type);
		
	}
	
}