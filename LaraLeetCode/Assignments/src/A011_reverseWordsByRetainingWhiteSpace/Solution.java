package A011_reverseWordsByRetainingWhiteSpace;

public class Solution {
	public static void main(String[] args) {
		System.out.println(reverseWords("a ab abc abcd"));
	}
	private static String reverseWords(String s) {
		StringBuilder ans = new StringBuilder();
		int left = 0, right = s.length() - 1;
		while (right >= 0) {
			if (left < s.length() && s.charAt(left) == ' ') {
				ans.append(' ');
				left++;
			} else {
				if (s.charAt(right) != ' ') {
					ans.append(s.charAt(right));
					right--;
					left++;
				} else {
					right--;
				}
			}
		}
		return ans.toString();
	}
}
