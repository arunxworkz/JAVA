class InbuildMethodRunner{
	
	public static void main(String[] args){
		
		
		InbuildMethod inbuildMethod = new InbuildMethod("Arun", 22);
		System.out.println(inbuildMethod);
		
		System.out.println("---------------------------------------");
		
		/*Here we are printing the object of the class InbuildMethodRunner 
		which is pointing to its instance, in return it is printing the string 
		representation i.e., basically address of the memeory location where the
		instance is stored. However when we print object java internally  invoke the
		toString() to convert the object into String. To directly print the information
		we need to over ride the toString() method. It is maily used in user interface
		where the information is made available for user in human readable form.*/
		
		InbuildMethod inbuildMethod1 = new InbuildMethod("Belavadi", 23);
		System.out.println(inbuildMethod1);
		
		System.out.println("---------------------------------------");
		
		
		//CustomClass customClass = new CustomClass();
		//customClass.printinr();
		
		InbuildMethod extends1 = new CustomClass();
		((CustomClass)extends1).printinr();
		
		
	}
	
	
}