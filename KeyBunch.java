class KeyBunch{
	
	String material="hdh";
	
	//0Key key;
	
		Key key = new Key(54, "sjd");

	KeyBunch(String material, Key key){
		
		this.key = key;
		//this.key = key;
		this.material = material;
		
		
	}
	
	
	void display(){
		System.out.println("Material: "+material);
		//System.out.println("Key: "+key);
		//System.out.println("Key is: "+key);
		key.display();
	}
	
	
	
	
}