class Ananya{
	
	
	String mobile;
	Knief knife;
	
	//Knief knief = new Knief(13, 6.8);
	
	Ananya(String mobile, Knief knife){
		this.knife = knife;
		this.mobile = mobile;
	}
	
	void display(){
		
		System.out.println("Mobile: "+mobile);
		//System.out.println("Knife:" +knife);
		//Knief knief = new Knief(13, 6.8);
		
		knife.display();
		
	}
	
	
	
}