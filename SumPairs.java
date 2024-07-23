class SumPairs{
	
	    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int [] arr = {1 ,2, 3, 4, 5};
        int sum = 10;
		boolean flag = false;
		
        for(int i =0 ;i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
				for(int k = j + 1;k < arr.length; k++)
				{
						if(arr[i] + arr[j] + arr[k] == sum)
						{
							System.out.println(String.format("The sum pairs are: (%d, %d, %d)", arr[i], arr[j], arr[k]));
						}
				}
            }
        }
    }
	
}