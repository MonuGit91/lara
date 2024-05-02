package Q010_longestUniqueCharactersSubstring;

import java.util.*;

public class Solution4 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int maxLen = 0;
		int start = 0, i = 0;
		
		for (; i < s.length(); i++) {
			if(set.contains(s.charAt(i))) {
				maxLen = Math.max(maxLen, i-start);
				while (set.contains(s.charAt(i))) {
					set.remove(s.charAt(start++));
				}
			}
			set.add(s.charAt(i));
		}
		maxLen = Math.max(maxLen, i-start);
		return maxLen;
	} 
}
