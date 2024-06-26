// Premium
package Q011_longest2UniqueCharacterSubstring;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcbabcbcb"));//5
		System.out.println(lengthOfLongestSubstring("ababccbcaacabbba"));//5
		System.out.println(lengthOfLongestSubstring("ninjacoder"));//3
		System.out.println(lengthOfLongestSubstring("ninninja"));//6
	}
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int j = 0, i = 0, maxLen = 0;
		for(; i < s.length(); i++) {
			char key = s.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
			
			if(map.size() > 2) {
				maxLen = Math.max(maxLen, i-j);
				
				while(map.size() > 2) {
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
