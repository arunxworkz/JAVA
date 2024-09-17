abstract class Walking{
	public Walking(){
		System.out.println("This is a abstract class constructor");
	}
	
	abstract public void method();
}

class Person extends Walking{
	public void method(){
		System.out.println("This ia an abstract class method overiding");
	}
}


class AbstractRunner{
	
	public static void main(String[] args){
		
		Person person = new Person();
		person.method();
		
		
		
		
	}
	
}