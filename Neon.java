class Neon{
	
	static void method(Integer n){
		
		int sum = 0;
		int square = n*n;
		System.out.println("The square is: "+square);
		String str =Integer.toString(square);
		int size = str.length();
		int[] arr = new int[size];
		System.out.println(str);
		
		for(int i = 0;i < str.length();i++){
			//Integer obj = Integer.valueOf(i);
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		for(int i = 0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
		
		for(int i = 0;i < arr.length;i++){
			sum = sum + arr[i];
		}
		
		if(sum == n){
			System.out.println("Neon");
		}
		else{
			System.out.println("Not Neon");
		}
	}
	
	public static void main(String[] args){
		method(9);
	}
	
}