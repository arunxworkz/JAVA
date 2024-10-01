/* Constructor chaining using this() can be done how ever we eant
except we need to arrange in an understandable way*/


class Person{
	int age;
	String name;
	long phNO;
	
	public Person(int age, String name){
		this(74896531L);
		this.age = age;
		this.name = name;
	}
	
	public Person(long phNO){
		//this(24, "arun");
		this.phNO = phNO;
	}
	
	void display(){
		System.out.println("NAme: "+name);
		System.out.println("age: "+age);
		System.out.println("phNO: "+phNO);
	}
}

class PersonRunner{
	public static void main(String[] args){
		Person person = new Person(74, "Arun");
		person.display();
	}
}