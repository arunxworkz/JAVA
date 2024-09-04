import java.lang.*;	

class SquareNumbers{
	
	
	public static void main(String[] args){
		
		int[] arr = {6, 8, -6, -8, 1};
		int size = arr.length;
		int[] arr1 = new int[size];
		int square = 0;
		for(int i =0 ;i < arr.length; i++){	
			arr[i] = arr[i] * arr[i];
		}
		
			if(arr.length == 0){
				System.out.println("No elements in array to print");
			}
			else{
				for(int i = 0 ;i < arr.length; i++){
					System.out.println(arr[i]);
				}	
			}
		
		
		
		
	}
	
	
}