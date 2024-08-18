class Primenumber{
	
	static int result;
	
	static void swap(int a, int b){
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("The swapped element is: "+a + " "+ b);
		
		
		System.out.println("==========================================================");
		
	}
	
	static void replace(Integer n){
		
		String result = "";
		String str = Integer.toString(n);
		for(int i = 0 ;i < str.length()	;i++){
			if(str.charAt(i) == '0'){
				result = result + "1";
			}
			else{
				result = result + str.charAt(i);
			}
		}
		System.out.println("The replced number is: "+Integer.parseInt(result));
		
		System.out.println("==========================================================");
		
	} 
	
	static void replacestring(String str){
		
		String result = "";
		int len = str.length();
		for(int i = 0;i < str.length(); i++){
			if(str.charAt(i) == 'A'){
				result = result + "o";
			}
			else{
				result = result + str.charAt(i);
			}
		}
		System.out.println("The original string is: "+ str);
		System.out.println("The replaced string is: "+ result);
		
		System.out.println("==========================================================");
		
	}
	
	
	
	static void reversing(Integer n){
		
		String str = Integer.toString(n);
		String result = "";
		int len = str.length();
		for(int i =len - 1 ;i >= 0; i--){
			result = result + str.charAt(i);
		}
		System.out.println("The revresed string is: "+Integer.parseInt(result));
		
		System.out.println("==========================================================");
		
	}
	
	
	static void stringreverse(String str){
		
		int len = str.length();
		String result = "";
		for(int i = len - 1; i>= 0; i--){
			result = result + str.charAt(i);
		}
		System.out.println("The reversed string is: "+result);
		
		System.out.println("==========================================================");
		
	}
	
	static void palindrome(Integer n){
		
		int original = n;
		String str = Integer.toString(n);
		String result = "";
		int len = str.length();
		for(int i = len - 1; i >= 0; i--){
			result = result + str.charAt(i);
		}
		
		int duplicate = Integer.parseInt(result);
		System.out.println("The revresed number is: "+ duplicate);
		
		if(duplicate == original){
			System.out.println("The number is plaindrome");
		}
		
		else{
			System.out.println("The number is not a plaindrome");
		}
		System.out.println("==========================================================");
	}
	
	
	static void palindromestring(String str){
		
		String original = str;
		String result = "";
		int len = str.length();
		for(int i = len - 1; i>= 0; i--){
			result = result + str.charAt(i);
		}
		System.out.println("The revresed string is: "+ result);
		
		/* if(original == result){ here we cnot compare two 
		string with '==' operator java will not support. Insted
		we need to use '.equals()' inbuilt method for the string
		comparison */
		if(original.equals(result))
		{
			System.out.println("The string is plaindrome");
		}
		else{
			System.out.println("The string is not a plaindrome");
		}
		
		System.out.println("==========================================================");
		
	}
	
	
	static void palindrome(int n){
		int original = n;
		int rev = 0;
		
		while(original != 0){
			rev = rev * 10 + original  % 10;
			original = original / 10;
		}
		if(rev == n){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not a palindrome");	
		}
	}
	
	
	static void year(int n){
		
		if(n % 400 == 0){
			System.out.println("The year is leap year");
		}
		else if(n % 100 == 0){
			System.out.println("The year is not a leap year");
		}
		else if(n % 4 == 0){
			System.out.println("The year is leap year");
		}
		else{
			System.out.println("The year is not leap year");
		}
		System.out.println("==========================================================");
	}
	
	
	static int factorial(int n){
		
		if(n == 0){
			System.out.println("nothing");
			return 1;
		}
		else if( n == 1){
			System.out.println("1");
			return 1;
		}
		else{
			int result = n * factorial(n - 1);
			//System.out.println("The factorial is: "+result);
			System.out.println("==========================================================");
			
			return result;
		}
		
	}
	
	
	
	static void quadraticroot(double a, double b, double c){
		
		double d = (b * b) / (4 * a * c);
		
		if(d > 0){
			
			double root1 = (-b + Math.sqrt(d) / (2 * a));
			double root2 = (b + Math.sqrt(d) / (2 * a));
			System.out.println("Roots are real and distinct");
			System.out.println(root1);
			System.out.println(root2);
		}
		
		else if(d == 0){
			double root = -b / (2 * a);
			System.out.println("The root is real and repeated");
		}
		
		else{
			double real = -b / (2 * a);
			double imginary = Math.sqrt(-d) / (2 * a);
            System.out.println("Root 2: " + real + " - " + imginary + "i");
			System.out.println("Root 1: " + real + " + " + imginary + "i");
		}
		System.out.println("==========================================================");
		
	}
	
	static int count(int n){
		int count = 0;
		
		if(n == 0){
			return 0;
		}
		
		if(n == 1){
			return 1;
		}
		
		while(n!=0){
			n = n % 10;
			count += 1;
		}
		
		System.out.println("The count is: "+count);
		return count;
	}
	
	
	static boolean armstrong(int n){
		String str = Integer.toString(n);
		int len = str.length();
		int sum = 0;
		//List<Integer> li = new ArrayList<>();
		for(int i = 0;i < len; i++){
			int digit = Character.getNumericValue(str.charAt(i));
			sum = sum + (int)Math.pow(digit, len);
		}
		//System.out.println(li);
		return sum == n;
	}
	
	public static void main(String[] args){
		
		
		int n = 5;
		if(n % 2 == 1 && n % n != 1){
			System.out.println("The number is prime");
		}
		else{
			System.out.println("The number is not a prime");
				
		}
		
		System.out.println("==========================================================");
		
		
		swap(10, 20);
		
		replace(103050);
		
		replacestring("ABBAAAC");
		
		reversing(1201);
		
		palindrome(1211);
		
		stringreverse("arun");
		
		palindromestring("aba");
		
		year(2001);
		
		/* factorial(5);
		System.out.println("The factorial is: "+result); */
		
		quadraticroot(1, 2, 5);
		
		//palindrome(1221);
		
		count(123);
		
		
	}
	
	
	
}