//Difference between thr try-catch and throws

class IlligalOpertion extends Exception{
	void method(){
		System.out.println("This is exception class");
	}
}


class Operation{
	
	void sum(int number) throws IlligalOpertion{
		if(number <= 0){
			System.out.println("The number is less than 0");
			throw new IlligalOpertion();
			/*This statment can not be reached.
			As we are deligating it*/
			//System.out.println("This is after exception");
		}
		else{
			System.out.println("the number is: "+number);
		}
	}	
}

class Deligation {
	
	public void operate() throws IlligalOpertion{
		Operation operation = new Operation();
		/*try{
			operation.sum(0);
		}catch(IlligalOpertion iO){
			System.out.println("This is catch block execution");
		}
		
		System.out.println("Thi is after the deliagtion");*/
		operation.sum(0);
	}	
}

class ExceptionRunner{
	public static void main(String[] aths) throws IlligalOpertion{
		Deligation deligation = new Deligation();
		try{
			deligation.operate();
		}
		catch(IlligalOpertion i){
			System.out.println("This is catch block execution");
		}
		/*Since we are handling using try catch block 
		the below line is being executed.*/
		System.out.println("This is after catch block");
	}
}

/*The out put here will be runtime exception will if we 
just deligating  the exception with the help of throws.

If we handle it with the help of try and a catch block then the output
will be: This is a catch block
		This is after catch block
		we can handel it in deligation class also, if that is the case
		then output is: The number is less than 0
						This is catch block
						This is after the deligation
						This is after the catch block
*/