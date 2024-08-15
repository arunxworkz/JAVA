class Gnanavi{
	
	Clip clip;
	String email;
	
	Gnanavi(String email, Clip clip){
		
		this.email = email;
		this.clip = clip;
		
	}
	
	void display(){
	
	System.out.println("Emial: "+email);
	//System.out.println("Clip: "+clip);
	clip.display();
	
	}
	
	
}