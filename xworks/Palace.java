class Palace{
	
	public static void main(String[] palaces){
		
		if(palaces.length != 3){
				System.out.println("Provide the required number of entries");
			}
			
		else{
				String palaceName = palaces[0];
				String palacesplace = palaces[1];
				String palacesState = palaces[2];
				System.out.println("NAme: "+palaceName+" "+"Area: "+palacesplace+" "+"State: "+palacesState);
			}
			
			
	}

		
	
}