class Demo{

	String name;
	int age;

	Demo(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void display(){
		System.out.println("NAme: "+name+" "+"Age: "+age);
	}
	
	
	public String toString(){
		System.out.println("NAme: "+name+" "+"Age: "+age);
		return null;
	}

}

class TestToString{
	public static void main(String[] args){
		Demo demo = new Demo("Arun", 22);
		System.out.println(demo); /* This will print the string representation of the demo object if we do
		not write a method to print the details.*/
		demo.display(); /* if we create a method to display the details then there is no problem, however
		the toString() method is better in invoking the methods automatically.*/

		/*Now we will print the details withou invoking the didplay() method, we will do it
		using toString() method by creating another object.*/
		Demo demo1 = new Demo("Karthik", 25);
		System.out.println(demo1); //Here no need of invoking the toString() it will be automatiaclly invoked.
		
	}
}