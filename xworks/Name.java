class Name{
	
	public static void method1(byte a, short b){
		System.out.println("Byte: "+a+" "+"Short: "+b);
	}
	
	public static void method2(int age,float str, char ch){
		//System.out.println("Integer: "+age+" "+"Float: "+" "+str+"Charcter: "+ch);
		if(age>=18){
			System.out.println("ELiglbe to vote");
		}
		else{
			System.out.println("Not eliglbe to vote");
		}
	}
	 
	public static void main(String[] args){
		method1(125, 26000); //type conversion
		method2(50, 45.6f, 'b');
		method2(12, 25.6f, 'e');
		method2(18, 100.00f, 't');
		
		//byte b = 15;
		//short c = 13;
		//method1(b, c);
	}
}