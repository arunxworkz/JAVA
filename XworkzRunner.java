interface Xworkz{
	
	void method(); //by default interface will be having abstract method, no need to specify
	
	public default void show(){ // all default methods in the interfaces are public impicitly
		System.out.println("This is a default method");
	}
}

class Tranee implements Xworkz{
	public void method(){ // it must be public as the abstract method in interface is by default public
		System.out.println("Tranees can choose the course");
	}
	
	/* public void show(){   
		System.out.println("Overrding the default mathod"); 
	}
	attempting to assign weaker access privileges; was public
    XworkzRunner.java:12: error: package SYstem does not exist
	
	This will be an error because we are trying to over ride the method which is package default 
	in interface and here it is public.
	*/
	public void show(){   
		System.out.println("Overrding the default mathod"); 
	}
	
}

class XworkzRunner{
	public static void main(String[] args){
		Xworkz xworkz; //We can not create an object of interface, however we can create reference of it.
		xworkz =new Tranee();
		xworkz.method();
		xworkz.show();
	}
}