class sumsquare{
	
	static int[] arr = {6, 8, 6, 8, 1};
	static int[] arr1;
	/*ststic int[] arr2;*/
	
	public static void method(int[] arr){
		int sum = 0;
		int n = arr.length;
		
		System.out.print("The orignal array: ");
		for(int i =0;i <n ;i++){
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
		System.out.print("The sum is:");
		for(int i=0;i<n;i++){
			sum = arr[i] + 1;
			arr[i] = sum;
			System.out.print(" "+arr[i]);
		}
		
		arr1 = new int[n]; /* not done then null pointer exception will occur 
		because array arr1 is declared as instance variable and not initilized.*/
		
		System.out.println();
		System.out.print("The multiple of 10 is: ");
		if(arr1.length > 0){
			for(int i =0 ;i < arr1.length;i++){
				arr1[i] = arr[i] * 10;//arr[i];
				System.out.print(" "+arr1[i]);
		    } 
	    }
		else{
			System.out.println("Nothing");
		}		
	}
	
	public static void main(String[] args){
		
		method(arr);

	}	
}