package Q011_longest2UniqueCharacterSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcbabcbcb"));
		System.out.println(lengthOfLongestSubstring("ababccbcaacabbba"));
		System.out.println(lengthOfLongestSubstring("ababccbcaacabbba"));
	}
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0, i = 0, maxLen = 0;
		for(; i < s.length(); i++) {
			char key = s.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
			
			if(map.size() > 2) {
				maxLen = Math.max(maxLen, i-left);
				
				while(map.size() > 2) {
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
