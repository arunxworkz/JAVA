class Parent{
	
	double r;
	
	public void circle(double r){
		this.r = r;
		System.out.println("This is Parent class");
	}
	
}

class Child extends Parent{
	
	double radius = 0;
	public void circle(double r){
		radius = 3.14 * r * r;
		System.out.println("The radius of circle is: "+radius);
	}
}

class Casting{
	public static void main(String[] args){
		Parent parent = new Child();
		parent.circle(5);
		
		//Child child = new Parent() // compile time error 
		
		Child child = (Child)parent;
		child.circle(5); //once overdiding is done than only child class methods are invoked.
	}
}