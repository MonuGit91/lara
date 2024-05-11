package A017_WordCount;

import java.util.*;

public class Solution {
	private static void wordCount(String s) {
		String words[] = s.trim().split("[\\s]+");
		Map<String, Integer> map = new HashMap<>();
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		map.forEach((key, val) -> System.out.println(key + " " + val) );
	}
	public static void main(String[] args) {
		String s = "abc xyz abc xyz hello abc xyz hello test xyz";
		wordCount(s);
	}
}
