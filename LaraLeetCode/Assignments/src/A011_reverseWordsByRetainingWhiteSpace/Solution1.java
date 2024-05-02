package A011_reverseWordsByRetainingWhiteSpace;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(reverseWords("a ab abc abcd"));
	}

	private static String reverseWords(String s) {
		char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] == ' ') {
                left++;
            } else if (charArray[right] == ' ') {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(charArray);
	}
}
