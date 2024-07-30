class Palindrome{
	
	
	public static void main(String[] args){
		
		int num = 451;
		int roiginal = num;
		int remainder;
		int reversed = 0;
		while(num != 0){
			remainder = num % 10;
			reversed = 	reversed * 10 + remainder;
			num = num / 10;
			
		}
		if(roiginal == reversed){
			System.out.println("Reversed: "+reversed);
		}
		else{
			System.out.println("Not reversed: "+num);
		}
	}
	
}