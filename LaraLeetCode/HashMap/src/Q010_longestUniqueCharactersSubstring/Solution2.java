package Q010_longestUniqueCharactersSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int maxLen = 0;
		int start = 0;
		
		for (int i = 0; i < s.length(); i++) {
			while (map.containsKey(s.charAt(i))) {
				map.remove(s.charAt(start++));
			}
			map.put(s.charAt(i), i);
			maxLen = Math.max(maxLen, map.size());
		}
		return maxLen;
	}

}
