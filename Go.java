//Run time ploymorphism (Function over riding)

class Parent{
	void show(){
		System.out.println("Parent");
	}
}

class Child extends Parent{
	void show(){
		System.out.println("This is child class");
	}
}

class Go{
	
	public static void main(String[] args){
		
		Parent parent = new Parent();
		parent.show();
		System.out.println("================================");
		Child child = new Child();
		child.show();
		System.out.println("================================");
		Parent parent1 = new Child();
		parent1.show();	 // Here the reference of type is parent
						// and the object is of child type. 
						//Therefore the show() method form the chils class
						// is invoked. "This is run time polymorphism".
		/*Here in this program, When an object of a child class is created, 
		then the method inside the child class is called. 
		This is because The method in the parent class is overridden by the child class. 
		Since The method is overridden, This method has more priority than the parent method inside the child class. 
		So, the body inside the child class is executed.*/				
	}
	
}