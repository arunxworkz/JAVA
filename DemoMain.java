class DemoMain{
	public static void main(String[] args){
		System.out.println("This is actual main method");
		main();
	}
	public static void main(){
		System.out.println("This is overloaded method");
	}
}