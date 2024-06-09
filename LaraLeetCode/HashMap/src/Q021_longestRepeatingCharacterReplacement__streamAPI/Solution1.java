package Q021_longestRepeatingCharacterReplacement__streamAPI;

import java.util.*;

public class Solution1 {
	public static int characterReplacement(String s, int k) {
		int left = 0, right = 0, n = s.length(), maxFrq = 0, maxLen = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (right < s.length()) {
			char rightCh = s.charAt(right);
			map.put(rightCh, map.getOrDefault(rightCh, 0) + 1);
			maxFrq = Math.max(maxFrq, map.get(rightCh));
			
			if (right - left + 1 - maxFrq > k) {
				maxLen = Math.max(maxLen, right - left);

				while (right - left + 1 - maxFrq > k) {
					char leftCh = s.charAt(left);
					map.put(leftCh, map.getOrDefault(leftCh, 0) - 1);
					left++;
					maxFrq = map.values().stream().max(Integer::compare).get();
				}
			}
			right++;
		}
		return Math.max(maxLen, right - left);
		
	}

	public static void main(String[] args) {
		System.out.println(characterReplacement("ABAB", 2));//4
		System.out.println(characterReplacement("AABABBA", 1));//4
	}

}
