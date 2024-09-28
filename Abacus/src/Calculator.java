import java.util.ArrayList;

public class Calculator {

	int a, b;
	double d;
	int[] arr = new int[5];
	ArrayList<Integer> li = new ArrayList<>();
	
	static public void add(int a, int b) {
		a = a;
		b = b;
		System.out.println("The addition of interher type: "+(a+b));
	}
	
	static public void add(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
				sum = sum + arr[i];
		}
		System.out.println("The sum of array element is: "+sum);
	}
	
	static public void add(int a, double d) {
		System.out.println("The sum of integer and double is: "+((double)a+d));
	}
	
	static public void add(ArrayList<Integer> li) {
		int sum = 0;
		for(int i = 0;i < li.size(); i++) {
			sum = sum + li.get(i);
		}
		System.out.println("The sum of array list is: "+li + " sum is: "+sum);
	}
	
	
	public static void main(String[] args) {
		add(10, 25);
		int[] brr = {1, 2,3, 4, 5};
		add(brr);
		add(10, 25.26d);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		add(arr);
	}
}
