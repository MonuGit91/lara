package Q010_longestUniqueCharactersSubstring;

import java.util.*;

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/

public class Solution {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int maxLen = 0;
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				maxLen = Math.max(maxLen, temp.length());
				while(map.containsKey(s.charAt(i))) {
					map.remove(temp.charAt(0));
					temp.deleteCharAt(0);
				}
			}
			else {
				temp.append(s.charAt(i));
				map.put(s.charAt(i), 1);
			}
		}
		return  Math.max(maxLen, temp.length());
	}
}
