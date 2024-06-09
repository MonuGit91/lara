// Premium
package Q012_longestKUniqueCharacterSubstring;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcbabcbcb", 2));//5
		System.out.println(lengthOfLongestSubstring("ababccbcaacabbba", 3));//16
		System.out.println(lengthOfLongestSubstring("ninjacoder", 4));//5
		System.out.println(lengthOfLongestSubstring("ninninja", 1));//2
		System.out.println(lengthOfLongestSubstring("aaabb", 3));//2
	}
	public static int lengthOfLongestSubstring(String s, int k) {
		Map<Character, Integer> map = new HashMap<>();
		int j = 0, i = 0, maxLen = 0;
		for(; i < s.length(); i++) {
			char key = s.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
			
			if(map.size() > k) {
				maxLen = Math.max(maxLen, i-j);
				
				while(map.size() > k) {
					if(map.get(s.charAt(j)) > 1) {
						map.put(s.charAt(j), map.get(s.charAt(j))-1);
					} else {
						map.remove(s.charAt(j));
					}
					j++;
				}
			}
		}
		return Math.max(maxLen, i-j);
	}
}
