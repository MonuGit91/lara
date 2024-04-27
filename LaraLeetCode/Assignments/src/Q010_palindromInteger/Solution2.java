package Q010_palindromInteger;

public class Solution2 {
	public static void main(String[] args) {
		System.out.println(isPalindrom(121));
		System.out.println(isPalindrom(-121));
		System.out.println(isPalindrom(10));
	}
	private static boolean isPalindrom(int x) {
		if(x < 0) return false;
		int reversed = 0;
		int original = x;
		while(x > 0) {
			reversed = reversed*10+x%10;
			x/=10;
		}
		return reversed == original;
	}

}