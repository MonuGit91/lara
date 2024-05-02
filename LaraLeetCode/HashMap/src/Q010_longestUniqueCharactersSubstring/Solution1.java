package Q010_longestUniqueCharactersSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0, i = 0, ans = 0;
		
		for (i = 0; i < s.length(); i++) {
			char ci = s.charAt(i);
			if(map.containsKey(ci)) {
				ans = Math.max(ans, i-left);
				while(map.containsKey(ci)) {
					map.remove(s.charAt(left++));
				}
			}
			map.put(ci, i);
		}
		
		return Math.max(ans, i-left);
	}

}
