class Reversing{
	
	static void reversing(Integer n){
		//if we give int then the error will be as desribed below. Therefore we use wrapper class Integer
		//String str = n.toString(); // causes an error: dereferenced class because we are trying to 
		//convert int which is an primitive data type into non primitive data type which is an String 
		// therefore we need to use wrapper calss by creating an object of an wrapper calss as shown

		String str = n.toString();
		int len = str.length();
		String reverse = "";
		for(int i = len - 1 ;i >=0 ; i--){
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The reversed number is: "+reverse);
		for(int i =0 ;i <= reverse.length();i++){
			if (reverse.charAt(0)== '0'){
				System.out.println("Not possible");
				break;
			} 
			else{
				Integer obj = Integer.valueOf(reverse); //valueOf()- is an inbuild function which convert
				//string value into integer with the help of the Integer wrapper class
				System.out.println(obj);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		
		reversing(4004	);
		
	}
	
}