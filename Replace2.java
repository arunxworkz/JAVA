import java.util.ArrayList;

class Replace2{
	
	public static void main(String[] args){
		
		ArrayList<String> li = new ArrayList<>();
		ArrayList<String> li1 = new ArrayList<>();
 		li.add("ax");
		li.add("bxx");
		li.add("xxcc");
		
		for(String s: li){
			li1.add(s.replace("x", ""));
		}
		
		System.out.println(li1);
		
	}
	
	
	
}