//Finding missing number

class MissingNumber{
	
	public static void main(String[] args){
		
		int[] arr = {3, 0, 1, 5, 2, 6, 4};
		
		int n = arr.length;
		int actualSum = 0;
		int sumOfArray = n * (n + 1) / 2;
		for(int i: arr){
			actualSum += i;
		}
		
		System.out.println(sumOfArray- actualSum);
		
	}
	
	
	
}