class Demo{

    static int a = 3;
    int b = 4;
}

class Demo1{
    public static void main(String[] args){
        Demo.a = 4;
		Demo.b = 5;
        System.out.println(Demo.a);
		System.out.println(Demo.b);
    }
}