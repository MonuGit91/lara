package Q003_reverseWordsInStirng;

public class Solution {

	public static void main(String[] args) {
		String str = "Hii this    is    MacBook";
		System.out.println(str);
		System.out.println(reverseWords(str));
	}

	public static String reverseWords(String s) {
		String arr[] = s.split("[\\s]+");
		StringBuffer sb = new StringBuffer();

		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}