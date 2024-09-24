//Run time polymorphism

class Demo{
	void method(){
		System.out.println("This is parent class");
	}
}
class Child extends Demo{
	void method(){
		System.out.println("This is parent class");
	}
}

Class Classic{
	public static void mian(Strng[] a){
	
		Demo demo = new Child();
		demo.method();
		
		Child child = new Child();
		child.method();
		/*The JVM will look for the type of object created and not for the type of refrence at
		runtime and it will invoke the method from the derived class of object type Child.
		
		
		The question arrises here is even though the object of type Child is created, what is the
		confusion for the JVM in invoking the method.
		The answer is here in this case there is no confusion for JVM in invoking the method since,
		object is of type Child.*/
		
		/*However thw confusion arrises when parent type refernce is pointing to the child type object
		as shown below. This is the case of runtime ploymorphism. Here is how it works: 
		1)We are creating the object of child class and assigning it to the object of parent refernce.
		2)At runtime the JVM will look for the object type and call the method in the chil class
		not from the parent class even the refernce is of parent class.
		
		The below code is the example for the runtime polymorphism, where the decision is made of which
		method is to be invoked based on the object type, not on reference type.*/
		
		Chils child1 = new Parent();
		child1.method();
}
}