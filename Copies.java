import java.util.ArrayList;

class Copies{
	
	public static void main(String[] args){
		
		ArrayList<String> li = new ArrayList<>();
		//ArrayList<String> li1;
		
		
		li.add("hello");
		li.add("there");
		li.add("");
		
		for(String s: li){
			System.out.println(s+s+s);
		}
		
		
		
		
		
	}
	
	
}