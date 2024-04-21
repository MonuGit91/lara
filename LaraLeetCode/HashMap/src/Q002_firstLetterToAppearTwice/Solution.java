package Q002_firstLetterToAppearTwice;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		String s = "leetCode";
		System.out.println(repeatedCharacter(s));
		
		String s1 = "abccbaacz";
		System.out.println(repeatedCharacter(s1));
	}
	
	 public static Character repeatedCharacter(String s) { 
		 Map<Character, Integer> map = new HashMap<>();
		 for(int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
			 map.put(ch, map.getOrDefault(ch, 0)+1);
			 if(map.get(ch) == 2) return ch;
		 }
		 return null;
	 }
}
