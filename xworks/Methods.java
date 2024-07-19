abstract class Methods{

	public static void main1(){
		System.out.println("This is static methos with access specifier");
	}
	
	static void main2(){
		System.out.println("Static method without Access Specifier");
	}
	
	static void main3(){
		System.out.println("Method without access specifier");
	}


	abstract void main6();
	
	public static void main(String[] args){
		System.out.println("This is Static methos with access specifier in addition to arguments");
		main1();
		main2();
		main3();
	}
}

