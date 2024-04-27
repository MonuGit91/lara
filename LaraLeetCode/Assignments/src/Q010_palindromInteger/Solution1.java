package Q010_palindromInteger;

public class Solution1 {
	public static void main(String[] args) {
		System.out.println(isPalindrom(121));
		System.out.println(isPalindrom(-121));
		System.out.println(isPalindrom(10));
	}
	private static boolean isPalindrom(int x) {
		String s = Integer.toString(x);
		String s1 = new StringBuilder(s).reverse().toString();
		return s.equals(s1);
	}
}
