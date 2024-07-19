import java.util.Scanner;
class Dividedyzero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be divisor and the divident: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		try{
			System.out.println(n/m);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Program completed");
	}
}