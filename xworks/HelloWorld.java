class Demography{
    
    public static void demo(){
        System.out.println("Today is a good day");
    }
    
    public void demo1(){
      System.out.println("Non static method from Demography calss is successfull invoked in HelloWorld class by creating the object of the class Demography");   
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Demography.demo();
        
		Demography obj = new Demography();
		
		obj.demo1();
    }
}