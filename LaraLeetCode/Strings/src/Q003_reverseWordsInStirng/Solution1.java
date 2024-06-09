package Q003_reverseWordsInStirng;

public class Solution1 {

	public static void main(String[] args) {
		String str = "Hii this    is    MacBook";
		System.out.println(str);
		System.out.println(reverseWords(str));
	}

	public static String reverseWords(String s) {
		StringBuilder str = new StringBuilder();
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				if (!word.isEmpty()) {
					word.append(" ");
					str.insert(0, word);
					word = new StringBuilder();
				}

			} else {
				word.append(s.charAt(i));
			}

		}
		if (!word.isEmpty()) {
			word.append(" ");
			str.insert(0, word);
		}
		return str.toString().trim();
	}
}