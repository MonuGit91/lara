package Q010_longestUniqueCharactersSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int map[] = new int[256];
		int i = 0, maxLen = 0, left = 0;
		
		for (; i < s.length(); i++) {
			while (map[s.charAt(i)] > 0) {
				map[s.charAt(left++)]--;
			}
			map[s.charAt(i)]++;
			maxLen = Math.max(maxLen, i-left+1);
		}
		return maxLen;
	}

}
