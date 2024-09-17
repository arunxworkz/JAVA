
//Can we write constructor in abstract class?
//yes

abstract class Walking{
	
	int distance;
	
	public Walking(){
		System.out.println("This is a abstract class constructor");
	}
	
	
	public Walking(int distance){
		this.distance = distance;
	}
	
	abstract public void method();
}

class Person extends Walking{
	
	/*An abstract class can nnot be instatiated therfore ther is an need of
	creating a sub class and overiding the methods to access it.
	Constructor in abstract class is correct and when we nned to access
	the properties of the paren abstract class then we need to craete the 
	constructor in the child class  and the subclass constructor can invoke 
	the abstract class constructor (either implicitly or explicitly using super).*/
	
	
	public Person(){
		super();
	}
	
	public Person(int distance){
		this.distance = distance;
	}
	
	public void method(){
		System.out.println("This ia an abstract class method overiding");
		System.out.println("The avregae distance is: "+super.distance);
	}
}


class AbstractRunner{
	
	public static void main(String[] args){
		
		Person person = new Person();
		person.method();
		
		System.out.println("-----------------------------------------------");
		
		/*This not possible because the abstract class can not be instantited
		Person person1 = new Walking(10);*/
		
		Person person1 = new Person(10);
		person1.method();
		
		
		
	}
	
}