//Reverseing the string using Bubble Sort logic

class ReversingTheString{
	
	public static String reverse(String str){
		char[] ch = str.toCharArray(); // used to convert the string into character array.
		int left = 0;
		int right = ch.length - 1;
		while(left < right){
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		System.out.println(ch);
		return new String(ch);
	}
	
	public static void main(String[] args){
		ReversingTheString rts = new ReversingTheString();
		rts.reverse("GeeksforGeeks");
	}
	
}

