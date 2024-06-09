package Q003_ReverseString;

public class Solution2 {
	public static String reverse(String s) {
		if(s.length() == 0) 
			return s;
		
		return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
	}
	public static void main(String[] args) {
		System.out.println(reverse("abcd"));
	}

}
