class Chickking{
	
	public static void compiler(){
		System.out.println("Today is a good day");
	}
	
	public void compiler1(){
		System.out.println("Today is a good day by compiler 1");
	}
	
	public static void main(String[] args){
		compiler();
		
		Chickking obj = new Chickking();
		
		obj.compiler1();
	}
	
}