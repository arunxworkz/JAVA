class Auditorium{
	
	Auditorium(){ // constructot without access specifier
		System.out.println("Auditorium");
	}
	
	public static void main(String[] args){
		
		new Auditorium();
		new Auditorium();
		new Auditorium();
		new Auditorium();
		Auditorium auditorium = new Auditorium();
		
	}
	
}