package A009_firstUniqueCharacterInAString;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println("input: " + s);
		System.out.println("output: " + firstUniqChar(s));
		
		String s1 = "loveleetcode";
		System.out.println("\ninput: " + s1);
		System.out.println("output: " + firstUniqChar(s1));
	}
	
	public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
