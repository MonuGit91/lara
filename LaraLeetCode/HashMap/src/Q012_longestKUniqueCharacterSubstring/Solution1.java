package Q012_longestKUniqueCharacterSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcbabcbcb", 2));//5
		System.out.println(lengthOfLongestSubstring("ababccbcaacabbba", 3));//16
		System.out.println(lengthOfLongestSubstring("ninjacoder", 4));//5
	}
	public static int lengthOfLongestSubstring(String s, int k) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0, i = 0, maxLen = 0;
		for(; i < s.length(); i++) {
			char key = s.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
			
			if(map.size() > k) {
				maxLen = Math.max(maxLen, i-left);
				
				while(map.size() > k) {
					map.put(s.charAt(left), map.get(s.charAt(left))-1);
					if(map.get(s.charAt(left)) == 0)
						map.remove(s.charAt(left));
					left++;
				}
			}
		}
		return Math.max(maxLen, i-left);
	}

}
