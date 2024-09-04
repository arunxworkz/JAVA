class RightMost{
	public static void main(String[] args){
		
		int[] arr = {16, 8, 886, 8, 1};
		int[] arr1 = new int[arr.length];	
		int reminder = 0;
		for(int i = 0;i < arr.length; i++){
			reminder = arr[i] % 10;
			arr1[i] = reminder;
		}
		
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		
	}
}