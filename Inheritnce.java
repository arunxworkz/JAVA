class A{
	
//private int i;
	//private int j;
	
	int i;
	int j;
	
	void pritn(int x, int y){
		i = x;
		j = y;
	}
	
}

class B extends A{
	
	int k;
	
	void sum(){
		System.out.println("The sum is: "+(i + j + k));
	}
}

class Inheritnce{
	
	public static void main(String[] args){
		
		//A ai = new A();
		
		/*
		//ai.i = 10;
		//ai.j = 20;
		
		Here it is not possible to access the private memebers of the spuer calss
		A even with in the same package (package concept is not introduced here) 
		by creating an object of the calss.
		Therefore to access the private members of the super class or base class we 
		need to create 'getter()' and 'setter()' methods
		
		*/
		
		B bi = new B();
		bi.k=10;
		bi.pritn(10, 20); //bi.print(ai.i, ai.j) OR bi.print(i, j) are not possible
		bi.sum();
		
		A ai = new B();
		ai.pritn(10, 20);
		ai.sum();
		
		/*The above code wil create an error - because we are trying to 
		invoke the method of class 'B' which is not in class 'A'
		because 'ai' is aobject type of class 'A'. If we need to 
		access then we need to type cast it.*/
		
	}
	
	
}