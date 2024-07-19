class Movie{
	
	public  static void picture(int age, String name){ //main methods ccn not be changed in any manner
		if(age > 18){
			System.out.println("Price is 1000 for "+name);
		}
		else{
			System.out.println("Price is 500");
		}
	}
	public static void main(String[] args){ 
		picture(20, "Kalki");
	}
}