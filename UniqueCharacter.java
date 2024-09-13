import java.util.HashSet;

class UniqueCharacter{
	
	public static void main(String[] args){
		
		HashSet<Character> li = new HashSet<>();
		
		String atr = "abcb";
		for(int i = 0;i < atr.length(); i++){
			char ch = atr.charAt(i);
			if(li.contains(ch)){
				li.remove(ch);
			}
			else{
				li.add(ch);
			}
		}
		/*for(int i= 0;i < li.size(); i++){
			System.out.println(li);  It will print r\two output
		}*/
		
		for(Character ele: li){  //here the element is character as we are checking each character
			System.out.println(ele);
		}
		
	}
	
	
	
	
}