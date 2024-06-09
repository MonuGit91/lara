package Q021_longestRepeatingCharacterReplacement__streamAPI;

import java.util.Arrays;


//By me
public class Solution {
	public static int characterReplacement(String s, int k) {
		int n = s.length();
		int l = 0, r = 0, maxfrq = 0, maxLen = 0;
		int frq[] = new int[26];

		while (r < s.length()) {
			frq[s.charAt(r) - 'A']++;
			maxfrq = Math.max(maxfrq, frq[s.charAt(r) - 'A']);
			if (r - l + 1 - maxfrq > k) {
				maxLen = Math.max(maxLen, r - l);
				while (r - l + 1 - maxfrq > k) {
					frq[s.charAt(l) - 'A']--;
					l++;
					maxfrq = Arrays.stream(frq).max().getAsInt();
				}
			}
			r++;
		}
		maxLen = Math.max(maxLen, r - l);
		return maxLen;
	}
	
	public static void main(String[] args) {
		System.out.println(characterReplacement("ABAB", 2));//4
		System.out.println(characterReplacement("AABABBA", 1));//4

	}

}
