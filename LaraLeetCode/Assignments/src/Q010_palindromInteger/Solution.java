package Q010_palindromInteger;

public class Solution {
	public static void main(String[] args) {
		System.out.println(isPalindrom(121));
		System.out.println(isPalindrom(-121));
		System.out.println(isPalindrom(10));
	}
	private static boolean isPalindrom(int x) {
		String s = Integer.toString(x);
		for(int i = s.length()-1; i >= 0; i--) 
			if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		return true;
	}
}
