package A015_substringWithAtmost2Vowels;

public class Solution {

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrst";
		System.out.println("input1: " + s + "\nOutput: ");
		atMost2VowelsSubstring(s);
		
		s = "AzxyrEbIhjtOlkmjyt";
		System.out.println("input2: " + s + "\nOutput: ");
		atMost2VowelsSubstring(s);
	}
	public static void atMost2VowelsSubstring(String s) {
		int left = 0, i = 0, vowelsCount = 0;
		boolean isLastPrinted = false;
		
		for(; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) vowelsCount++;
			
			if(vowelsCount > 2) {
				System.out.println(s.substring(left, i));
				if(i == s.length()) isLastPrinted = true;
				
				while(vowelsCount > 2) {
					if(isVowel(s.charAt(left))) vowelsCount--;
					left++;
				}
			}
		}
		if(!isLastPrinted) System.out.println(s.substring(left, i));
		System.out.println();
	}
	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		
		return false;
	}
}
