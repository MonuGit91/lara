package Q005_validPalindrom2;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println("input: aba");
		System.out.println("output: " + validPalindrome("aba"));
		System.out.println("\ninput: abca");
		System.out.println("output: " + validPalindrome("abca"));
	}

	private static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static boolean validPalindrome(String s) {
		int n = s.length();
		int i = 0, j = n - 1;
		while (i < j && s.charAt(i) == s.charAt(j)) {
			i++;
			j--;
		}
		return i >= j || isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
	}

}
