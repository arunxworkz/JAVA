class ReturnTypes1{
	
	public static String load(String item){
		if(item == "book"){
			return "Correct";
		}
		else{
		return "Nothing to return";
		}
	}
	public static void main(String[] args){
		System.out.println(load("book"));
	}
}