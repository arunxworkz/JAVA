class StaticAndNonStaticRunner{
	
	public static void main(String[] args){
	StaticAndNonStatic.method();
	
	/*
	here there is no need of creating any object to invoke mothod()
	as it is static*/
	
	StaticAndNonStatic staticAndNonStatic = new StaticAndNonStatic();
	staticAndNonStatic.method1(); /*Here there is an requirment of creating an object 
	
	In case of memory ---> static: only one copy is created for entire class in RAM and only 
	that memeory is used every time.

	non-static: here every time the memory is created in RAM for every object.
	
	*/
	
	/*A static method can only access static members and static methods if another class
	or the same class but can not access nonn staic members and methods.
	
	
	A non-static method can access static data members and static methods as well 
	as non-static members and methods of another class or the same class,*/
	}
	
}