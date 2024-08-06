public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1220; // You can change this number to test other cases
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        System.out.println("The reversed number is: "+reversedNumber);
		
		
		String num = String.valueOf(reversedNumber);
		System.out.println(num);
		
		for(int i = 0;i < num.length(); i++){
			if(num.charAt(i) == '0')
			{
				System.out.println("possible");
				break;
			}
			else{
				System.out.println("not possible");
				break;
			}
		}
			
    }
}
