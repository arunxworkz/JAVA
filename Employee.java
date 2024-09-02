/*Constructor chaining is a chaining where one constructor will call another chaining 
with in the same class.
Condiser below exampe to an employee details where the first constructor is having the 2 parameters.
Suppose in future context if we need to add employee phone number and employee address
then we need to create another constructor. Here a doubt will arrise that insted of craeting
a new constructor every time we can modify the present constructor. The problem is that 
this constructor will be used in many other classes also, therefoe if any changes is done 
in this constructor then it will affetc all the constructor whilc is very tough task to resolve
the problem, and another problem is if we somehow we created the consrtuctor as many as 
possible without distrubing the main constructor, the priblem is every time when we need to 
initilize the instance variables using different constructor we need to create new object every time
which will make usage of memory in heavy quantity. To resolve this we can use constructor
chaining ith help of 'this()' method.*/


	
class Employee{
	String name;
	int id;
	long phno;
	String address;
	String designation;
	
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	Employee(String designation){
		this("Arun", 1002);
		
		/*this("Pranav", 1003); - This wil causes an erroe because the 'this()'
		method should be the first line in the constructor. Usage of another 
		this() method will leads to error as each constructor will be having
		only one implicit(automatically given by compiler) or explicit constructor call*/
		
		 this.designation = designation;
		
	}
	
	Employee(long phNo, String address){
		/*this - it is key word used for differentiate between the instance variable and 
		the local variable during the initilization. 
		this() - used for the constructor chaninig*/
		this("Software Developer");
		this.address = address;
		this.phno = phNo;
	}
	

	
	void display(){
		System.out.println("Empplyee name: "+name);
		System.out.println("Empplyee id: "+id);
		System.out.println("Empplyee phone number: "+phno);
		System.out.println("Empplyee address: "+address);
		System.out.println("DEsignation: "+designation);
	}
	
	
	public static void main(String[] args){
		Employee emp = new Employee(7483079907L, "Rajajinagara");
		emp.display();	
	}
	
}