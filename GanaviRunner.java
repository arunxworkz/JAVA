class GanaviRunner{
	
	public static void main(String[] atgs){
		
		Clip clip = new Clip("Red", "Hair Clip");
		Ganavi ganavi = new Ganavi("ganavi@gmail.com", clip);
		
		Clip clip1 = new Clip("Purple", "Short clip");
		Ganavi ganavi1 = new Ganavi("ganavi30@gmail.com", clip1);
		
		Clip clip2 = new Clip("Black", "Long hair clip");
		Ganavi ganavi2 = new Ganavi("ganavi40@gmail.com", null);

		
		ganavi.display();
		
		System.out.println("=====================================");
		
		ganavi1.display();
		
		System.out.println("=====================================");
		
		ganavi2.display();
		
	}
	
	
	
}