class Outerclass{
	
	private int a = 10;
	
	class Innerclass{
		
		void innerMethod(){
			System.out.println("The inner class");
			System.out.println("The inner class is having the access to the private filed of the outer class");
			System.out.println(a);
		}
		
		
	}
	
	void outermethod(){
		System.out.println("Invoking the inner class");
		/*Innerclass in = new Innerclass(); here the object of the inner class is create as it is 
									       bring invoked by the extrenal class 
		in.innerMethod();
		
		
		 The invoking process can aslo be done from main method without creating the onbject of the inner
		class by directly using the object of the external calss as shown below
		
			Outerclass out = new Outerclass();
			out.outermethod();
			
			Outerclass.Innerclass ouin = out.new Innerclass();
		          */
	}
	
	
}

class InnerOuterclasses{
	
	public static void main(String[] args){
		
		Outerclass out = new Outerclass();
		out.outermethod();
		Outerclass.Innerclass ouin = out.new Innerclass();
		ouin.innerMethod();
		
		
	}
	
	
}