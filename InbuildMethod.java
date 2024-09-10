class InbuildMethod{
	
	String name;
	int age;
	
	InbuildMethod(String name, int age){
		this.name = name;
		this.age  = age;
	}
	
	
	/*We will override the toString() method */
	
	public String toString(){
		return "Name: " + name +" " + "age: " + age;
	}
	
	/*It will directly print the name and age of the person*/
	
}