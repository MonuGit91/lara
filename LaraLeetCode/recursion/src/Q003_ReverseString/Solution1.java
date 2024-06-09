package Q003_ReverseString;

public class Solution1 {
	static String rev = "";
	public static void reverse(String s) {
		if(s.length() == 0) 
			return;
		
		rev += s.charAt(s.length()-1);
		reverse(s.substring(0, s.length()-1));
	}
	public static void main(String[] args) {
		reverse("abcd");
		System.out.println(rev);
	}

}
